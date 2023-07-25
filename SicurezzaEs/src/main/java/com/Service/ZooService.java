package com.Service;

import com.Entity.Zoo;
import com.Repository.ZooRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class ZooService {

    @Autowired
    ZooRepository repo;

    @GetMapping("/getAll")
    public List<Zoo> getAll(){
        return repo.findAll();
    }

    @PostMapping("/add")
    public Zoo add(Zoo obj){
        return repo.save(obj);
    }

    @PutMapping("/update")
    public Zoo update(Zoo obj){
        return repo.save(obj);
    }

    @DeleteMapping("/delete")
    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public Zoo getById(int id){
        return repo.findById(id).orElse(null);
    }
}
