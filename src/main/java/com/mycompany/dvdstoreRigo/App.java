package com.mycompany.dvdstoreRigo;

import com.mycompany.dvdstoreRigo.controller.MovieController;
import com.mycompany.dvdstoreRigo.repository.FileMovieRepository;
import com.mycompany.dvdstoreRigo.service.IMovieService;
import com.mycompany.dvdstoreRigo.service.DefaultMovieService;


/**
 * Application class
 * Project entry point
 */
public class App {
    public static void main(String[] args) {
        IMovieService movieService = new DefaultMovieService();
        movieService.setMovieRepository(new FileMovieRepository());

        MovieController movieController = new MovieController();
        movieController.setMovieService(movieService);

        movieController.addUsingConsole();

    }
}
