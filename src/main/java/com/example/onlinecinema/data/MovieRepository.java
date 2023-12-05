package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    Movie findByTitle(String title);
}
