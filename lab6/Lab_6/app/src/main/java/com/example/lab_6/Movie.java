package com.example.lab_6;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private int year;
    private String director;
    List<String> stars = new ArrayList<>();
    private String description;

    public Movie(String name, String director, int year, List<String> stars, String description) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.stars = stars;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getStars() {
        return stars;
    }

    public void setStars(List<String> stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
