package com.example.movieinfoservice.exceptions;

public class MovieNotFound extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public MovieNotFound(String msg) {
        super(msg);
    }
}
