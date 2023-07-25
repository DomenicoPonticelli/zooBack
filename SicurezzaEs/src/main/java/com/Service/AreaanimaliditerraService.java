package com.Service;

import com.Entity.Areaanimaliditerra;
import com.Repository.AreaanimaliditerraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
@Service
public class AreaanimaliditerraService {

    @Autowired
    AreaanimaliditerraRepository repo;

    public List<Areaanimaliditerra> getAll(){
        return repo.findAll();
    }

    public Areaanimaliditerra add(Areaanimaliditerra obj){
        return repo.save(obj);
    }

    public Areaanimaliditerra update(Areaanimaliditerra obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Areaanimaliditerra getById(int id){
        return repo.findById(id).orElse(null);
    }
}
