package com.Service;

import com.Entity.UserEntity;
import com.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
public class UserEntityService {

    @Autowired
    UserRepository repo;

    public List<UserEntity> getAll(){
        return repo.findAll();
    }

    public UserEntity add(UserEntity obj){
        return repo.save(obj);
    }

    public UserEntity update(UserEntity obj){
        return repo.save(obj);
    }

    public String delete(Long id){
        repo.deleteById(id);
        return "Eliminazione avvenuta con successo!";
    }

    public UserEntity getById(Long id){
        return repo.findById(id).orElse(null);
    }
}
