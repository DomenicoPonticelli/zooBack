package com.Controller;

import com.Entity.Areacompetenza;
import com.Service.AreacompetenzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Areacompetenza")
public class AreacompetenzaController {

    @Autowired
    AreacompetenzaService service;

    @GetMapping("/getAll")
    public List<Areacompetenza> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Areacompetenza add(Areacompetenza obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Areacompetenza update(Areacompetenza obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Areacompetenza getById(int id){
        return service.getById(id);
    }
}
