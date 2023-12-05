package com.example.onlinecinema.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.Year;
import java.util.List;

@Data
@Entity
public class Serial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String title;
    private Year year;

    @NotNull
    private short rating;
    private String description;

    @NotNull
    @ManyToMany
    private List<Country> countries;

    @NotNull
    @ManyToMany(targetEntity = Genre.class)
    private List<Genre> genres;

    @NotNull
    @ManyToMany(targetEntity = Actor.class)
    private List<Actor> actors;

    @NotNull
    @ManyToMany(targetEntity = Director.class)
    private List<Director> directors;

    @OneToMany
    private List<Season> seasons;
}
