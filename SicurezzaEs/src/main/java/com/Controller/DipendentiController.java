package com.Controller;

import com.Entity.Dipendenti;
import com.Service.DipendentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("dipendenti")
public class DipendentiController {

    @Autowired
    DipendentiService service;

    @GetMapping("/getAll")
    public List<Dipendenti> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Dipendenti add(Dipendenti obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Dipendenti update(Dipendenti obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Dipendenti getById(int id){
        return service.getById(id);
    }
}
