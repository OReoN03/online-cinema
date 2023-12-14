package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface DirectorRepository extends CrudRepository<Director, Integer> {
}
