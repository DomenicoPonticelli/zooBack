package com.Controller;

import com.Entity.Areaanimaliacquatici;
import com.Service.AreaanimaliacquaticiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("Areaanimaliacquatici")
public class AreaanimaliacquaticiController {

    @Autowired
    AreaanimaliacquaticiService service;

    @GetMapping("/getAll")
    public List<Areaanimaliacquatici> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Areaanimaliacquatici add(Areaanimaliacquatici obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Areaanimaliacquatici update(Areaanimaliacquatici obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Areaanimaliacquatici getById(int id){
        return service.getById(id);
    }
}
