package com.mycompany.dvdstoreRigo.service;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.IMovieRepository;

public interface IMovieService {
    void registerMovie(Movie movie);

}
