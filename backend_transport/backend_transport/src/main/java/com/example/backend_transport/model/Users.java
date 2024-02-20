package com.example.backend_transport.model;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Users implements Serializable {
    @Id
    @Column(name = "email",length = 255)
    private String email;

    @Column(name = "name",nullable = false,length = 255)
    private String name;

    @Column(name = "numero",nullable = false,length = 20)
    private String numero;

    @Column(name = "cin",unique = true,nullable = false,length = 30)
    private String cin;

    @Column(name = "adresse",nullable = false,length = 200)
    private String adresse;

    @Column(name = "gender",nullable = false,length = 10)
    private String gender;
}
