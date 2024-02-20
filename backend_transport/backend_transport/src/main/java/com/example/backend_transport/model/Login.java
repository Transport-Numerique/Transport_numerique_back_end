package com.example.backend_transport.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Login implements Serializable {
    @Id
    @Column(name = "id_login",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_login;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;
}
