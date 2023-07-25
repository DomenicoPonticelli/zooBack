package com.Service;

import com.Entity.Areacompetenza;
import com.Repository.AreacompetenzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
@Service
public class AreacompetenzaService {

    @Autowired
    AreacompetenzaRepository repo;

    public List<Areacompetenza> getAll(){
        return repo.findAll();
    }

    public Areacompetenza add(Areacompetenza obj){
        return repo.save(obj);
    }

    public Areacompetenza update(Areacompetenza obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Areacompetenza getById(int id){
        return repo.findById(id).orElse(null);
    }
}
