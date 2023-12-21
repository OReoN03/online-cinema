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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscription_id")
    private int id;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal cost;

    @NotNull
    private short period;

    @ManyToMany
    @JoinTable(name = "movie_in_subscription",
            joinColumns = {@JoinColumn(name = "movie_id")},
            inverseJoinColumns = @JoinColumn(name = "subscription_id"))
    private List<Movie> movies;

    @ManyToMany
    @JoinTable(name = "serial_in_subscription",
            joinColumns = {@JoinColumn(name = "serial_id")},
            inverseJoinColumns = @JoinColumn(name = "subscription_id"))
    private List<Serial> serials;
}
