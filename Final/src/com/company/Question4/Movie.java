package com.company.Question4;

import java.util.Date;
import java.util.List;

public class Movie {
    String movieTitle;
    Date releaseDate;
    String director;
    List<String> actors;

    public Movie(String movieTitle, Date releaseDate, String director, List<String> actors) {
        this.movieTitle = movieTitle;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actors = actors;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}
