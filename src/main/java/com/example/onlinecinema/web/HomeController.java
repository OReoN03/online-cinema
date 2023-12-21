package com.example.onlinecinema.web;

import com.example.onlinecinema.data.MovieRepository;
import com.example.onlinecinema.domain.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class HomeController {
    private MovieRepository movieRepository;

    public HomeController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @ModelAttribute
    public void getNewMovies(Model model) {
        List<Movie> newMovies = movieRepository.findTop5ByOrderByYearDesc();
        model.addAttribute("newMovies", newMovies);
    }

    @ModelAttribute
    public void getTopMovies(Model model) {
        List<Movie> topMovies = movieRepository.findTop5ByOrderByRatingDesc();
        model.addAttribute("topMovies", topMovies);
    }
}
