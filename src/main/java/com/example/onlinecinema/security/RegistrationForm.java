package com.example.onlinecinema.security;

import com.example.onlinecinema.data.CountryRepository;
import com.example.onlinecinema.domain.Address;
import com.example.onlinecinema.domain.Country;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.example.onlinecinema.domain.User;

import java.time.LocalDate;

@Data
public class RegistrationForm {
    private String fullName;
    private String email;
    private String password;
    private String phoneNumber;
    private String gender;
    private LocalDate birthDate;

    private String country;
    private String region;
    private String locality;
    private String street;
    private String house;
    private String postalCode;

    private CountryRepository countryRepository;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(fullName, email, passwordEncoder.encode(password), phoneNumber, gender, birthDate, toAddress());
    }

    public Country toCountry() {
        return countryRepository.findByName(country);
    }

    public Address toAddress() {
        return new Address(toCountry(), region, locality, street, house, postalCode);
    }
}
