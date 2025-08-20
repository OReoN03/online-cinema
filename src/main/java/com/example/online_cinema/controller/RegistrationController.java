package com.example.online_cinema.controller;

import com.example.online_cinema.repository.AddressRepository;
import com.example.online_cinema.repository.CountryRepository;
import com.example.online_cinema.domain.Country;
import com.example.online_cinema.security.RegistrationForm;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.online_cinema.repository.UserRepository;

import java.util.List;

@Controller
@RequestMapping("/register")
@ComponentScan(basePackages = "com.example.online_cinema.*")
public class RegistrationController {
    private UserRepository userRepository;
    private AddressRepository addressRepository;
    private CountryRepository countryRepository;
    private PasswordEncoder passwordEncoder;

    public RegistrationController(
            UserRepository userRepository,
            AddressRepository addressRepository,
            CountryRepository countryRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.addressRepository = addressRepository;
        this.countryRepository = countryRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping
    public String registerForm() {
        return "registration";
    }

    @ModelAttribute
    public void getCountries(Model model) {
        List<Country> countries = (List<Country>) countryRepository.findAll();
        model.addAttribute("countries", countries);
    }

    @PostMapping
    public String processRegistration(RegistrationForm form) {
        form.setCountryRepository(countryRepository);
        addressRepository.save(form.toAddress());

        userRepository.save(form.toUser(passwordEncoder));
        return "redirect:/login";
    }
}
