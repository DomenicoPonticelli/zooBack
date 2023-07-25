package com.Controller;

import com.Entity.Nutrizione;
import com.Service.NutrizioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("nutrizione")
public class NutrizioneController {

    @Autowired
    NutrizioneService service;

    @GetMapping("/getAll")
    public List<Nutrizione> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Nutrizione add(Nutrizione obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Nutrizione update(Nutrizione obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Nutrizione getById(int id){
        return service.getById(id);
    }
}
