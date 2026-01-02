package com.mycompany.dvdstoreRigo.repository;

import com.mycompany.dvdstoreRigo.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMovieRepository implements IMovieRepository {
    public void add (Movie movie) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("movies.txt", true))) {
            writer.println(movie.getTitle() + ";" + movie.getGenre());
            System.out.println("The movie " + movie.getTitle() + " has been added.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
