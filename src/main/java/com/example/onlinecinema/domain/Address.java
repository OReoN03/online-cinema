package com.example.onlinecinema.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    private String country;
    @NotNull
    private String region;
    @NotNull
    private String locality;
    @NotNull
    private String street;
    @NotNull
    private String house;
    @NotNull
    private String postalCode;
}
