package com.Controller;

import com.Entity.Visita;
import com.Service.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("visita")
public class VisitaController {
    @Autowired
    VisitaService service;

    @GetMapping("/getAll")
    public List<Visita> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Visita add(Visita obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Visita update(Visita obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Visita getById(int id){
        return service.getById(id);
    }
}
