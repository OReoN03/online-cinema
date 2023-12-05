package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Serial;
import org.springframework.data.repository.CrudRepository;

public interface SerialRepository extends CrudRepository<Serial, Integer> {
    Serial findByTitle(String title);
}
