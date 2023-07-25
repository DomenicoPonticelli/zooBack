package com.Service;

import com.Entity.Dipendenti;
import com.Repository.DipendentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DipendentiService {

    @Autowired
    DipendentiRepository repo;

    public List<Dipendenti> getAll(){
        return repo.findAll();
    }

    public Dipendenti add(Dipendenti obj){
        return repo.save(obj);
    }

    public Dipendenti update(Dipendenti obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Dipendenti getById(int id){
        return repo.findById(id).orElse(null);
    }
}
