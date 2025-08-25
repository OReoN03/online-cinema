package com.example.online_cinema.security;

import com.example.online_cinema.domain.User;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@Data
public class RegistrationForm {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String gender;
    private LocalDate birthDate;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(firstName, lastName, email, passwordEncoder.encode(password), phoneNumber, gender, birthDate);
    }
}
