package com.Controller;

import com.Entity.Prenotazioni;
import com.Service.PrenotazioniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("prenotazioni")
public class PrenotazioniController {
    @Autowired
    PrenotazioniService service;

    @GetMapping("/getAll")
    public List<Prenotazioni> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Prenotazioni add(Prenotazioni obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public Prenotazioni update(Prenotazioni obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Prenotazioni getById(int id){
        return service.getById(id);
    }
}
