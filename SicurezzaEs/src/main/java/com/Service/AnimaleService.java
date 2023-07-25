package com.Service;

import com.Entity.Animale;
import com.Repository.AnimaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class AnimaleService {

    @Autowired
    AnimaleRepository repo;

    public List<Animale> getAll(){
        return repo.findAll();
    }

    public Animale add(Animale obj){
        return repo.save(obj);
    }

    public Animale update(Animale obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Animale getById(int id){
        return repo.findById(id).orElse(null);
    }

}
