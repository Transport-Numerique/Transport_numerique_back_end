package com.example.backend_transport.service;

import com.example.backend_transport.model.Login;
import com.example.backend_transport.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public void registerLogin(Login login){
        loginRepository.save(login);
    }
    public boolean emailExists(String email) {
        return loginRepository.existsByEmail(email);
    }

     public List<Login> loginList(){
        return loginRepository.findAll();
     }


}
