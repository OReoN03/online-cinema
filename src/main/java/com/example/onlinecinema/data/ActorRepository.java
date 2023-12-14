package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Actor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
}
