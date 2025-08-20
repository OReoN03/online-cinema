package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Serial;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SerialRepository extends CrudRepository<Serial, Integer> {
    Serial findByTitle(String title);

    List<Serial> findTop5ByOrderByYearDesc();

    List<Serial> findTop5ByOrderByRatingDesc();
}
