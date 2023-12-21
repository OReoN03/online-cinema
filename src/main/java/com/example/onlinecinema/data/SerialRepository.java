package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Movie;
import com.example.onlinecinema.domain.Serial;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SerialRepository extends CrudRepository<Serial, Integer> {
    Serial findByTitle(String title);

    List<Serial> findTop5ByOrderByYearDesc();

    List<Serial> findTop5ByOrderByRatingDesc();
}
