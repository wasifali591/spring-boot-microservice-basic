package com.example.movieinfoservice.services;

import com.example.movieinfoservice.exceptions.MovieNotFound;
import com.example.movieinfoservice.models.Movie;
import com.example.movieinfoservice.models.MovieSummary;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MovieInfoService {
    private RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    public Movie getMovieInfo(int movieId) {

        try {
            MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + apiKey, MovieSummary.class);
            return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview());
        } catch (MovieNotFound m) {
            System.out.println(m);
        }catch (Exception e){
            System.out.println(e);
            if (e.getMessage().equalsIgnoreCase("java.lang.NullPointerException")){
                throw new MovieNotFound("Movie not Found: " + movieId);
            }
        }

        return new Movie(movieId, "", "");
    }
}
