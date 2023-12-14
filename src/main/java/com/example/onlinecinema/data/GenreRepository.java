package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
