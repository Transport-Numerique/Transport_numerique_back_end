package com.example.backend_transport.service;

import com.example.backend_transport.model.Reservation;
import com.example.backend_transport.repository.ResevationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {


    @Autowired
    private ResevationRepository resevationRepository;
    public void insertResevation(Reservation reservation){
       resevationRepository.save(reservation);
    }

    public List<Reservation> allReservation(){
        return resevationRepository.findAll();
    }

}
