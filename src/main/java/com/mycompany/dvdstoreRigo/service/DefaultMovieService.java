package com.mycompany.dvdstoreRigo.service;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.IMovieRepository;

public class DefaultMovieService implements  IMovieService{

    private IMovieRepository movieRepository;


    public IMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void setMovieRepository(IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }


}
