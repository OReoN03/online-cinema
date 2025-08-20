package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    Movie findByTitle(String title);

    List<Movie> findTop5ByOrderByYearDesc();

    List<Movie> findTop5ByOrderByRatingDesc();
}
