package com.Controller;

import com.Entity.Recinto;
import com.Service.RecintoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("recinto")
public class RecintoController {

    @Autowired
    RecintoService service;

    @GetMapping("/getAll")
    public List<Recinto> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Recinto add(Recinto obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Recinto update(Recinto obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Recinto getById(int id){
        return service.getById(id);
    }
}
