package com.Service;

import com.Entity.Nutrizione;
import com.Repository.NutrizioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NutrizioneService {

    @Autowired
    NutrizioneRepository repo;

    public List<Nutrizione> getAll(){
        return repo.findAll();
    }

    public Nutrizione add(Nutrizione obj){
        return repo.save(obj);
    }

    public Nutrizione update(Nutrizione obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Nutrizione getById(int id){
        return repo.findById(id).orElse(null);
    }
}
