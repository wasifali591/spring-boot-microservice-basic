package com.example.moviecatalogservice.exceptions;

public class MovieNotFound extends Exception{

    private static final long serialVersionUID = 1L;

    public MovieNotFound(String msg) {
        super(msg);
    }
}
