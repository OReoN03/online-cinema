package com.example.onlinecinema.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal cost;

    @NotNull
    private short period;

    @ManyToMany
    private List<Movie> movies;

    @ManyToMany
    private List<Serial> serials;
}
