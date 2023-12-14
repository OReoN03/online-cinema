package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Episode;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EpisodeRepository extends CrudRepository<Episode, Integer> {
}
