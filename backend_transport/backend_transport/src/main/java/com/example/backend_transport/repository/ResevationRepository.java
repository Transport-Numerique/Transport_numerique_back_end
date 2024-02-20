package com.example.backend_transport.repository;

import com.example.backend_transport.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResevationRepository extends JpaRepository<Reservation ,Integer> {
}
