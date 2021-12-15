package com.company.Question4;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> actors_titanic = new ArrayList<>();
        actors_titanic.add("Jack");
        actors_titanic.add("Rose");
        Movie titanic = new Movie("Titanic", new GregorianCalendar(1997, Calendar.DECEMBER, 11).getTime(), "Steven Spielberg", actors_titanic);

        List<String> actors_pride = new ArrayList<>();
        actors_titanic.add("Elizabeth");
        actors_titanic.add("Darcy");
        Movie prideAndPrejudice = new Movie("Pride and Prejudice", new GregorianCalendar(1995, Calendar.APRIL, 10).getTime(), "Robert", actors_pride);

        List<String> actors_moses = new ArrayList<>();
        actors_titanic.add("Moses");
        actors_titanic.add("Cleopatra");
        Movie moses = new Movie("Moses", new GregorianCalendar(1989, Calendar.NOVEMBER, 07).getTime(), "Walt Whitman", actors_moses);

        List<String> actors_matilda = new ArrayList<>();
        actors_titanic.add("Matilda");
        actors_titanic.add("The teacher");
        Movie matilda = new Movie("Matilda", new GregorianCalendar(2001, Calendar.JULY, 19).getTime(), "Walt Disney", actors_matilda);

        List<String> actors_hp = new ArrayList<>();
        actors_titanic.add("Daniel Radcliffe");
        actors_titanic.add("Emma Watson");
        Movie harryPotter = new Movie("Harry Potter", new GregorianCalendar(2005, Calendar.DECEMBER, 12).getTime(), "Albus Dumbledore", actors_hp);

        List<String> actors_avengers = new ArrayList<>();
        actors_titanic.add("Steve");
        actors_titanic.add("Tony Stark");
        Movie avengers = new Movie("Avengers", new GregorianCalendar(2010, Calendar.MAY, 23).getTime(), "Marvel", actors_avengers);

        List<Movie> action = new ArrayList<>();
        action.add(moses);
        action.add(avengers);

        List<Movie> fiction = new ArrayList<>();
        fiction.add(titanic);
        fiction.add(matilda);
        fiction.add(harryPotter);
        fiction.add(prideAndPrejudice);

        Genre actionGenre = new Genre(action);
        Genre fictionGenre = new Genre(fiction);
        ArrayList<Genre> genres = new ArrayList<>();
        genres.add(actionGenre);
        genres.add(fictionGenre);

        Netflix netflix = new Netflix(genres);

        //For all movies released before 2000, add the string "(Classic)" to the title of the movie using flatMap.
        System.out.println("Movies released before 2000");
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime()))
                .forEach(movie -> movie.setMovieTitle(movie.getMovieTitle() + "(Classic)"));


        //Get the latest 3 movies released using .limit() method of stream.
        List<Movie> latest = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream())
                .sorted((o1, o2) -> o2.getReleaseDate().compareTo(o1.getReleaseDate())).limit(3).collect(Collectors.toList());

        //Create a predicate for release date before 2000 and a predicate for release date before 1990 and then Chain the predicates for finding movies between 1990 and 2000.
        List<Movie> listOfAllMovie = netflix.getGenres().stream().flatMap(genre -> genre.getMovies().stream()).collect(Collectors.toList());
        Predicate<Movie> before2000 = movie -> movie.getReleaseDate().before(new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime());
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime());
        printMovieInRange((ArrayList<Movie>) listOfAllMovie, before2000, after1990);

        //Write a method which that will add release year in the title of the movie and return the title and then use this method for all the movies.
        for(Movie movie : listOfAllMovie) {
            addReleaseYear(movie);
        }

        //Sorting on one of the feature(Ex: Released year or title) which will use comparator.
        Collections.sort(listOfAllMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getMovieTitle().compareTo(o2.getMovieTitle());
            }
        });
    }

    private static void addReleaseYear(Movie movie) {
        SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy");
        String year = dayFormat.format(movie.getReleaseDate());
        movie.setMovieTitle(movie.getMovieTitle() + year);
    }

    private static void printMovieInRange(ArrayList<Movie> res, Predicate<Movie> condition1, Predicate<Movie> condition2){
        for (Movie movie: res) {
            if(condition1.test(movie) && condition2.test(movie)){
                System.out.println(movie.getMovieTitle());
            }
        }
    }
}
