package com.Service;

import com.Entity.Recinto;
import com.Repository.RecintoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecintoService {

    @Autowired
    RecintoRepository repo;

    public List<Recinto> getAll(){
        return repo.findAll();
    }

    public Recinto add(Recinto obj){
        return repo.save(obj);
    }

    public Recinto update(Recinto obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Recinto getById(int id){
        return repo.findById(id).orElse(null);
    }
}
