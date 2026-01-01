package com.mycompany.dvdstoreRigo;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.service.MovieService;

import java.util.Scanner;

/**
 * Application class
 * Project entry point
 */
public class App {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Can you enter the title of the movie?");
        String title = sc.nextLine();

        System.out.println("Can you enter the genre of the movie?");
        String genre = sc.nextLine();

        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);

    }
}
