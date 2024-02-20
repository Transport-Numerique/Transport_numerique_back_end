package com.example.backend_transport.service;

import com.example.backend_transport.model.Users;
import com.example.backend_transport.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
     @Autowired
    private UsersRepository repository;

    public void registreUser(Users users) {
        repository.save(users);

    }

    public boolean emailExist(String email){
        return repository.existsByEmail(email);
    }
    public List<Users> listUsers(){
       return repository.findAll();
    }


}
