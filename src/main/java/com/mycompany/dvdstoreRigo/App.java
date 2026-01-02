package com.mycompany.dvdstoreRigo;

import com.mycompany.dvdstoreRigo.controller.MovieController;
import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.GoLiveMovieRepository;
import com.mycompany.dvdstoreRigo.service.IMovieService;
import com.mycompany.dvdstoreRigo.service.MovieService;

import java.util.Scanner;

/**
 * Application class
 * Project entry point
 */
public class App {
    public static void main(String[] args) {
        IMovieService movieService = new MovieService();
        movieService.setMovieRepository(new GoLiveMovieRepository());

        MovieController movieController = new MovieController();
        movieController.setMovieService(movieService);

        movieController.addUsingConsole();

    }
}
