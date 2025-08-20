package com.example.online_cinema.repository;

import com.example.online_cinema.domain.Address;
import com.example.online_cinema.domain.Country;
import org.springframework.data.repository.CrudRepository;

public interface CountryRepository extends CrudRepository<Country, Address> {
    Country findByName(String name);
}
