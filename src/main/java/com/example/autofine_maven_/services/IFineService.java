package com.example.autofine_maven_.services;

import java.util.List;
import com.example.autofine_maven_.dto.AddFineDTO;
import com.example.autofine_maven_.dto.UpdateFineDTO;
import com.example.autofine_maven_.models.Fine;

public interface IFineService {

    public List<Fine> allByCarDataId(Long id);
    public Fine add(AddFineDTO addFineDTO);
    public Fine update(UpdateFineDTO updateFineDTO);
    public Boolean delete(Long id);
}
