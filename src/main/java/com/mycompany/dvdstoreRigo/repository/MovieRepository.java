package com.mycompany.dvdstoreRigo.repository;

import com.mycompany.dvdstoreRigo.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements IMovieRepository {
    private static List<Movie> movies = new ArrayList<>();
    public void add (Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
