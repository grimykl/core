package sn.grimykl.invoise.repository;

import sn.grimykl.invoise.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository {

    private static List<Movie> movies = new ArrayList<Movie>();

    public void add(Movie movie) {
        movies.add(movie);
        System.out.println("Movie added with title "+movie.getTitle()+" and main actor "+movie.getMainActor()+".");
    }
}
