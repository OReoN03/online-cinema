package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Integer> {
}
