package com.example.onlinecinema.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MoviesController {
    @GetMapping("/movies")
    public String movies() {
        return "movies";
    }
}
