package com.example.backend_transport.controlleur;

import com.example.backend_transport.model.Reservation;
import com.example.backend_transport.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResevationController {
    @Autowired
    private ReservationService reservationService;
    @GetMapping("/reservation")
    public List<Reservation> allResevation(){
        return reservationService.allReservation();
    }
}
