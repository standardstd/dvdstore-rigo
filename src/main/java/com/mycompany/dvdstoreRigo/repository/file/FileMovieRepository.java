package com.mycompany.dvdstoreRigo.repository.file;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.IMovieRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Repository
public class FileMovieRepository implements IMovieRepository {
    @Value("${movies.file.location}")
    private  File file;

    public File getFile() {
        return file;
    }

    public void add(Movie movie) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
            writer.println(movie.getTitle() + ";" + movie.getGenre());
            System.out.println("The movie " + movie.getTitle() + " has been added.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
