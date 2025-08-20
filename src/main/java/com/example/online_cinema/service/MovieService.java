package com.example.online_cinema.service;

import com.example.online_cinema.domain.Movie;
import com.example.online_cinema.exception.UnknownMovieException;
import com.example.online_cinema.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getNewMovies() {
        return movieRepository.findTop5ByOrderByYearDesc();
    }

    public List<Movie> getTopMovies() {
        return movieRepository.findTop5ByOrderByRatingDesc();
    }

    public Movie getMovieById(int id) {
        return movieRepository.findById(id).orElseThrow(() -> new UnknownMovieException(id));
    }

    public Movie getMovieByTitle(String title) {
        return movieRepository.findByTitle(title);
    }
}
