package com.Service;

import com.Entity.Visita;
import com.Repository.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VisitaService {
    @Autowired
    VisitaRepository repo;

    public List<Visita> getAll(){
        return repo.findAll();
    }

    public Visita add(Visita obj){
        return repo.save(obj);
    }

    public Visita update(Visita obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Visita getById(int id){
        return repo.findById(id).orElse(null);
    }
}
