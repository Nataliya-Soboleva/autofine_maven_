package com.example.autofine_maven_.controllers;


import com.example.autofine_maven_.dto.AddFineDTO;
import com.example.autofine_maven_.dto.UpdateFineDTO;
import com.example.autofine_maven_.models.Fine;
import com.example.autofine_maven_.services.IFineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
public class FineController {

    @Autowired
    private IFineService fineService;

    @GetMapping("/fine/{fineId}")
    public List<Fine> byId(@PathVariable(name = "fineId")Long fineId ){return fineService.allByCarDataId(fineId);}

    @PostMapping("/fine")
    public Fine add(@RequestBody AddFineDTO addFineDTO){return fineService.add(addFineDTO);}

    @PutMapping("/fine")
    public  Fine update(@RequestBody UpdateFineDTO updateFineDTO){return fineService.update(updateFineDTO);}

    @DeleteMapping("/fine/{fineId}")
   public Boolean delete(@PathVariable (name ="fineId")Long fineId){return fineService.delete(fineId);}
}
