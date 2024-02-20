package com.example.backend_transport.repository;

import com.example.backend_transport.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {
    boolean existsByEmail(String email);
}
