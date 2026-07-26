package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Integer> {
    Country findByName(String name);
}
