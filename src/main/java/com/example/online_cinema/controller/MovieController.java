package com.example.online_cinema.controller;

import com.example.online_cinema.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MovieController {
    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public String movies() {
        return "movies/movies";
    }

    @ModelAttribute
    public void getNewMovies(Model model) {
        model.addAttribute("newMovies", movieService.getNewMovies());
    }

    @ModelAttribute
    public void getTopMovies(Model model) {
        model.addAttribute("topMovies", movieService.getTopMovies());
    }

    @GetMapping("/movies/{id}")
    public String movie(@PathVariable Integer id, Model model) {
        model.addAttribute("movie", movieService.getMovieById(id));

        return "movies/movie";
    }
}
