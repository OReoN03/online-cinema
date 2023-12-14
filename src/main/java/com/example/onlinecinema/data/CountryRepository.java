package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Address;
import com.example.onlinecinema.domain.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface CountryRepository extends CrudRepository<Country, Address> {
}
