package sn.grimykl.invoise.service;

import sn.grimykl.invoise.entity.Movie;
import sn.grimykl.invoise.repository.MovieRepository;

public class MovieService {

    private static MovieRepository movieRepository = new MovieRepository();

    public void registerMovie(Movie movie){
        movieRepository.add(movie);
    }
}
