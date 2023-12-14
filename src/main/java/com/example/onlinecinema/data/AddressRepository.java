package com.example.onlinecinema.data;

import com.example.onlinecinema.domain.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
