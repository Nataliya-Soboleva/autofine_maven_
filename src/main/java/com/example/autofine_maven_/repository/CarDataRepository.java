package com.example.autofine_maven_.repository;


import com.example.autofine_maven_.models.CarData;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarDataRepository extends CrudRepository<CarData,Long> {
    @Query(value = "SELECT * FROM public.cars_data WHERE plate_number = ?1 ", nativeQuery = true )
    CarData findByPlateNumber(String plateNumber);
}
