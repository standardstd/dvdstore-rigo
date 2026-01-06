package com.mycompany.dvdstoreRigo.repository.memory;

import com.mycompany.dvdstoreRigo.entity.Movie;
import com.mycompany.dvdstoreRigo.repository.IMovieRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryMovieRepository implements IMovieRepository {
    private static List<Movie> movies = new ArrayList<>();
    public void add (Movie movie) {
        movies.add(movie);
        System.out.println("The movie "+movie.getTitle()+" has been added.");
    }
}
