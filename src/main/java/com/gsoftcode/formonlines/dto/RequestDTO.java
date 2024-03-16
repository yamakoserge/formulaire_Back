package com.gsoftcode.formonlines.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class RequestDTO {

    private Long id;

    private String description;

    @Column(length = 5000)
    private String objectif;

    private String cible;

    @Column(length = 5000)
    private String message;

    private int nomber;

    private String exemple;

    private String delai;

    private String name;

    private String email;

    private Long phone;

    private Date date;

}
