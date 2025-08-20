package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Genre;
import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
