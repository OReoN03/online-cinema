package com.example.onlinecinema.security;

import com.example.onlinecinema.data.AddressRepository;
import com.example.onlinecinema.data.CountryRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.onlinecinema.data.UserRepository;
@Controller
@RequestMapping("/register")
@ComponentScan(basePackages = "com.example.onlinecinema.*")
public class RegistrationController {
    private UserRepository userRepository;
    private AddressRepository addressRepository;
    private CountryRepository countryRepository;
    private PasswordEncoder passwordEncoder;
    public RegistrationController(UserRepository userRepository, AddressRepository addressRepository,
                                  CountryRepository countryRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.countryRepository = countryRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @GetMapping
    public String registerForm() {
        return "registration";
    }
    @PostMapping
    public String processRegistration(RegistrationForm form) {
        form.setCountryRepository(countryRepository);
        addressRepository.save(form.toAddress());

        userRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
