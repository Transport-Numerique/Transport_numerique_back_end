package com.example.backend_transport.repository;

import com.example.backend_transport.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {
    boolean existsByEmail(String email);
}
