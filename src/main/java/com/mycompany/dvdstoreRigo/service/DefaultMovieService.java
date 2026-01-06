package com.mycompany.dvdstoreRigo.service;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.IMovieRepository;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements  IMovieService{

    private final IMovieRepository movieRepository;

    public DefaultMovieService( IMovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public IMovieRepository getMovieRepository() {
        return movieRepository;
    }

    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }


}
