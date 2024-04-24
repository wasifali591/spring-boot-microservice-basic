package com.example.moviecatalogservice.resources;


import com.example.moviecatalogservice.models.CatalogItem;
import com.example.moviecatalogservice.models.UserRating;
import com.example.moviecatalogservice.services.MovieInfoService;
import com.example.moviecatalogservice.services.UserRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private MovieInfoService movieInfoService;

    @Autowired
    private UserRatingService userRatingService;

    @GetMapping("/{userId}")
//    @HystrixCommand(fallbackMethod = "getFallbackCatalog")
    public List<CatalogItem> getCatalog(@PathVariable("userId") int userId){

        //call userRating service to get the details
        UserRating userRating = userRatingService.getUserRating(userId);

        return userRating.getUserRating().stream().map(rating -> {
            return movieInfoService.getCatalogItem(rating);
        }).collect(Collectors.toList());
    }
    public List<CatalogItem> getFallbackCatalog(@PathVariable("userId") int userId) {
        return Arrays.asList((new CatalogItem("No Movie!", "", 0)));
    }
}
