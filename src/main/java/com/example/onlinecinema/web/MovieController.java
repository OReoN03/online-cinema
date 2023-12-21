package com.example.onlinecinema.web;

import com.example.onlinecinema.data.MovieRepository;
import com.example.onlinecinema.domain.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class MovieController {
    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies/{id}")
    public String movie(@PathVariable Integer id, Model model) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            model.addAttribute("movie", movie.get());
            return "movies/movie";
        } else {
            return "error";
        }
    }
}
