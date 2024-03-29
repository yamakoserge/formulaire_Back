package com.gsoftcode.formonlines.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class FormUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String description;

    @Column(length = 5000)
    private String objectif;

    private String cible;

    @Column(length = 5000)
    private String message;

    private int number;

    private String example;

    private String delai;

    private String name;

    private String email;

    private Long phone;

    private Date date;





}
