package com.example.onlinecinema.web;

import org.springframework.web.bind.annotation.GetMapping;

public class MoviesController {
    @GetMapping("/movies")
    public String movies() {
        return "movies";
    }


}
