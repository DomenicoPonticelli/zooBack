package com.Controller;

import com.Entity.Areaanimaliditerra;
import com.Service.AreaanimaliditerraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Areaanimaliditerra")
public class AreaanimaliditerraController {
    @Autowired
    AreaanimaliditerraService service;

    @GetMapping("/getAll")
    public List<Areaanimaliditerra> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Areaanimaliditerra add(Areaanimaliditerra obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Areaanimaliditerra update(Areaanimaliditerra obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Areaanimaliditerra getById(int id){
        return service.getById(id);
    }
}
