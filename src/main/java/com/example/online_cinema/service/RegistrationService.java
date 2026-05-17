package com.example.online_cinema.service;

import com.example.online_cinema.exception.UserAlreadyExistsException;
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

    public void processRegistration(RegistrationForm form) {
        String email = form.getEmail();
        if (userRepository.existsByEmail(email)) {
            throw new UserAlreadyExistsException(email);
        }
        userRepository.save(form.toUser(passwordEncoder));
    }
}
