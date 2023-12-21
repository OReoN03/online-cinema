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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serial_id")
    private int id;

    @NotNull
    private String title;
    private Year year;

    @NotNull
    private short rating;
    private String description;

    @NotNull
    @ManyToMany
    @JoinTable(name = "country_in_serial",
            joinColumns = { @JoinColumn(name = "serial_id") },
            inverseJoinColumns = { @JoinColumn(name = "country_id") })
    private List<Country> countries;

    @NotNull
    @ManyToMany(targetEntity = Genre.class)
    @JoinTable(name = "serial_genre",
            joinColumns = { @JoinColumn(name = "serial_id") },
            inverseJoinColumns = { @JoinColumn(name = "genre_id") })
    private List<Genre> genres;

    @NotNull
    @ManyToMany(targetEntity = Actor.class)
    @JoinTable(name = "actor_in_serial",
            joinColumns = { @JoinColumn(name = "serial_id") },
            inverseJoinColumns = { @JoinColumn(name = "actor_id") })
    private List<Actor> actors;

    @NotNull
    @ManyToMany(targetEntity = Director.class)
    @JoinTable(name = "director_in_serial",
            joinColumns = { @JoinColumn(name = "serial_id") },
            inverseJoinColumns = { @JoinColumn(name = "director_id") })
    private List<Director> directors;

    @OneToMany(mappedBy = "serial")
    private List<Season> seasons;
}
