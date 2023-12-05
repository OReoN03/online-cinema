package com.example.onlinecinema.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Year;
import java.util.List;

@Data
@Entity
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private short number;
    private Year year;

    @ManyToOne
    private Serial serial;

    @OneToMany
    private List<Episode> episodes;
}
