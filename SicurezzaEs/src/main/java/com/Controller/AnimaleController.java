package com.Controller;

import com.Entity.Animale;
import com.Service.AnimaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("animale")
public class AnimaleController {

    @Autowired
    AnimaleService service;

    @GetMapping("/getAll")
    public List<Animale> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Animale add(Animale obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Animale update(Animale obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Animale getById(int id){
        return service.getById(id);
    }
}
