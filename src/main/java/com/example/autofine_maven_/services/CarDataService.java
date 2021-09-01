package com.example.autofine_maven_.services;

import com.example.autofine_maven_.dto.AddCarDataDTO;
import com.example.autofine_maven_.dto.UpdateCarDataDTO;
import com.example.autofine_maven_.models.CarData;
import com.example.autofine_maven_.repository.CarDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class CarDataService implements ICarDataService{

    @Autowired
    private CarDataRepository carDataRepository;

    @Override
    public CarData byId(long id)
    {
        CarData carDataById = new CarData();
        try{
            carDataById = carDataRepository.findById(id).get();
        }
        catch(NoSuchElementException e)
        {

        }
        finally {
            return carDataById;
        }
    }

    @Override
    public CarData findByPlateNumber(String plateNumber)
    {
        CarData carDataByPlateNumber = new CarData();

        try{
            carDataByPlateNumber = carDataRepository.findByPlateNumber(plateNumber);
        }
        catch(NoSuchElementException e){e.getStackTrace();}
        finally {
            return carDataByPlateNumber;
        }
    }




    @Override
    public CarData addCarData(AddCarDataDTO addCarDataDTO) {

        CarData newCarData = new CarData();
        CarData carData = new CarData();
        newCarData.setId(0l);

        try
        {
            newCarData.setPlateNumber(addCarDataDTO.getPlateNumber());
            newCarData.setSeriesNumberDocument(addCarDataDTO.getSeriesNumberDocument());

            carData = carDataRepository.save(newCarData);
        }
        catch(NoSuchElementException e){}
        finally
        {
            return carData;
        }
    }

    @Override
    public CarData update(UpdateCarDataDTO updateCarDataDTO) {

        CarData carDataToUpdate = new CarData();

        try
        {
            carDataToUpdate = carDataRepository.findById(updateCarDataDTO.getId()).get();

            carDataToUpdate.setPlateNumber(updateCarDataDTO.getPlateNumber());
            carDataToUpdate.setSeriesNumberDocument(updateCarDataDTO.getSeriesNumberDocument());


            carDataToUpdate = carDataRepository.save(carDataToUpdate);
        }
        catch(NoSuchElementException e){}
        finally
        {
            return carDataToUpdate;
        }
    }

    @Override
    public boolean delete(Long id) {

        try {
            CarData carDataToDelete = carDataRepository.findById(id).get();
            carDataRepository.delete(carDataToDelete);
            return true;
        }

        catch (NoSuchElementException e){}

        return false;
    }



}
