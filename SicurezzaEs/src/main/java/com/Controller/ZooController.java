package com.Controller;

import com.Entity.Zoo;
import com.Service.ZooService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("zoo")
public class ZooController {

    @Autowired
    ZooService service;

    @GetMapping("/getAll")
    public List<Zoo> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Zoo add(Zoo obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Zoo update(Zoo obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Zoo getById(int id){
        return service.getById(id);
    }
}
