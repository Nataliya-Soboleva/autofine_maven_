package com.example.autofine_maven_.repository;


import com.example.autofine_maven_.models.Fine;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FineRepository extends CrudRepository<Fine, Long> {

    @Query(value = "SELECT * FROM public.fines WHERE car_data_id = ?1 ", nativeQuery = true )
    List<Fine> findByCarDataId(Long id);
}
