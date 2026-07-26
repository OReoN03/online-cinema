package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Episode;
import org.springframework.data.repository.CrudRepository;

public interface EpisodeRepository extends CrudRepository<Episode, Integer> {
}
