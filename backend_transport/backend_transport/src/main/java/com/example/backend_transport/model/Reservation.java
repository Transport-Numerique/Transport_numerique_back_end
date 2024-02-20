package com.example.backend_transport.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Reservation {
    @Id
    @Column(name = "id_reservation",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reservation;

    @CreationTimestamp
    private Timestamp date_reservation;

    @Column(name = "type_payment",nullable = false)
    private String type_payment;

    @CreationTimestamp
    private Timestamp depart_date;

    @Column(name = "tarif",nullable = false)
    private Double tarif;

    @Column(name = "destination",nullable = false)
    private String destination;

    @ManyToOne
    @JoinColumn(name = "email_user_re")
    private Users user_RE;
}
