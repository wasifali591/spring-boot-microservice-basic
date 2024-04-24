package com.example.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    private int userId;

    private List<Rating> userRating;

    public UserRating() {
    }

    public UserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    public UserRating(int userId, List<Rating> userRating) {
        this.userId = userId;
        this.userRating = userRating;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }
}
