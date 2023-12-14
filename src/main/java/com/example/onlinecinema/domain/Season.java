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
    @Column(name = "season_id")
    private int id;

    @NotNull
    private short number;
    private Year year;

    @ManyToOne
    @JoinColumn(name = "serial_id", nullable = false)
    private Serial serial;

    @OneToMany
    @JoinTable(name = "episode")
    private List<Episode> episodes;
}
