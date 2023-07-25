package com.Service;

import com.Entity.Vasca;
import com.Repository.VascaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VascaService {

    @Autowired
    VascaRepository repo;

    public List<Vasca> getAll(){
        return repo.findAll();
    }

    public Vasca add(Vasca obj){
        return repo.save(obj);
    }

    public Vasca update(Vasca obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Vasca getById(int id){
        return repo.findById(id).orElse(null);
    }
}
