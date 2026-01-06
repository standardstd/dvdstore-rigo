package com.mycompany.dvdstoreRigo.controller;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {
//    @Autowired
    private final IMovieService movieService;

    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    public IMovieService getMovieService() {
        return movieService;
    }

    public void addUsingConsole() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Can you enter the title of the movie? ");
        String title = sc.nextLine();

        System.out.print("Can you enter the genre of the movie? ");
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }
}
