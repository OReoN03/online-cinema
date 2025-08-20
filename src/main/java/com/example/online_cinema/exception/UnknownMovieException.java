package com.example.online_cinema.exception;

public class UnknownMovieException extends RuntimeException {
    public UnknownMovieException(int id) {
        super("Unknown movie id: " + id);
    }
}
