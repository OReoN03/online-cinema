package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Season;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface SeasonRepository extends CrudRepository<Season, Integer> {
}
