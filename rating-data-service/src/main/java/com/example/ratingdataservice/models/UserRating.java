package com.example.ratingdataservice.models;

import java.util.List;

public class UserRating {

    private List<Rating> userRating;

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public List<Rating> getUserRating() {
        return userRating;
    }
}
