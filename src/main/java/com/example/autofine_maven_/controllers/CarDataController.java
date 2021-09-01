package com.example.autofine_maven_.controllers;


import com.example.autofine_maven_.dto.AddCarDataDTO;
import com.example.autofine_maven_.dto.UpdateCarDataDTO;
import com.example.autofine_maven_.models.CarData;
import com.example.autofine_maven_.services.ICarDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarDataController {

    @Autowired
    private ICarDataService carDataService;

    @GetMapping("/cardata/{plateNumber}")
    public CarData byPlateNumber(@PathVariable(name="plateNumber")String plateNumber){return carDataService.findByPlateNumber(plateNumber);}

    @PostMapping("/cardata")
    public CarData addCarData(@RequestBody AddCarDataDTO addCarDataDTO){return carDataService.addCarData(addCarDataDTO);}

    @PutMapping("/cardata")
    public CarData update(@RequestBody UpdateCarDataDTO updateCarDataDTO){return  carDataService.update(updateCarDataDTO);}

    @DeleteMapping("/cardata/{carDataId}")
    public boolean delete(@PathVariable(name="carDataId")long carDataId){return  carDataService.delete(carDataId);}


}
