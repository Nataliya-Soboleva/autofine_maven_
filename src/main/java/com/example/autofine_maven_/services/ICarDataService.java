package com.example.autofine_maven_.services;

import com.example.autofine_maven_.dto.AddCarDataDTO;
import com.example.autofine_maven_.dto.UpdateCarDataDTO;
import com.example.autofine_maven_.models.CarData;

public interface ICarDataService {
    public CarData byId(long id);
    public CarData addCarData(AddCarDataDTO addCarDataDTO);
    public CarData update(UpdateCarDataDTO updateCarDataDTO);
    public boolean delete(Long id);
    public CarData findByPlateNumber(String plateNumber);
}
