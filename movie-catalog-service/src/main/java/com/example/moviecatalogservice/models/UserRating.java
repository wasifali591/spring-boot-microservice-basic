package com.example.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    public UserRating() {
    }

    public UserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    private List<Rating> userRating;

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public List<Rating> getUserRating() {
        return userRating;
    }
}
