package com.Controller;

import com.Entity.Vasca;
import com.Service.VascaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("vasca")
public class VascaController {

    @Autowired
    VascaService service;

    @GetMapping("/getAll")
    public List<Vasca> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Vasca add(Vasca obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Vasca update(Vasca obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Vasca getById(int id){
        return service.getById(id);
    }
}
