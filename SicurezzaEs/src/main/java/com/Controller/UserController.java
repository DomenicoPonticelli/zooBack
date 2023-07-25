package com.Controller;

import com.Entity.UserEntity;
import com.Service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    @Autowired
    UserEntityService service;

    @GetMapping("/getAll")
    public List<UserEntity> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public UserEntity add(UserEntity obj){
        return service.add(obj);
    }

    @PutMapping("/update")
    public UserEntity update(UserEntity obj){
        return service.add(obj);
    }

    @DeleteMapping("/delete")
    public String delete(Long id){
        service.delete(id);
        return "Eliminazione avvenuta con successo!";
    }

    @GetMapping("/getById")
    public UserEntity getById(Long id){
        return service.getById(id);
    }
}
