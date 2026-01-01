package com.mycompany.dvdstoreRigo.service;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.MovieRepository;

public class MovieService {

    private MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }


}
