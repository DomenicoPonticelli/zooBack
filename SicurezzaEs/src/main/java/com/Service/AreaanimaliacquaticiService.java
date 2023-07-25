package com.Service;

import com.Entity.Areaanimaliacquatici;
import com.Repository.AreaanimaliacquaticiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaanimaliacquaticiService {

    @Autowired
    AreaanimaliacquaticiRepository repo;

    public List<Areaanimaliacquatici> getAll(){
        return repo.findAll();
    }

    public Areaanimaliacquatici add(Areaanimaliacquatici obj){
        return repo.save(obj);
    }

    public Areaanimaliacquatici update(Areaanimaliacquatici obj){
        return repo.save(obj);
    }

    public String delete(int id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public Areaanimaliacquatici getById(int id){
        return repo.findById(id).orElse(null);
    }
}
