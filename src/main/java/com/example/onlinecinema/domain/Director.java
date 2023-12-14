package com.example.onlinecinema.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "director_id")
    private int id;

    @NotNull
    private String name;
}
