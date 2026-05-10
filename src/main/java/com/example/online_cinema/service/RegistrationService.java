package com.example.online_cinema.service;

import com.example.online_cinema.repository.UserRepository;
import com.example.online_cinema.security.RegistrationForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    // TODO check uniqueness of email
    public void processRegistration(RegistrationForm form) {
        userRepository.save(form.toUser(passwordEncoder));
    }
}
