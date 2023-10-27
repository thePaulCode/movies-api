package dev.thepaulcode.movies.service.movieservice;

import dev.thepaulcode.movies.model.movie.Movie;
import dev.thepaulcode.movies.model.movie.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    // pesquisar todos os filmes existentes no DB
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

    // pesquisar um único filme usando o imdbId
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);

    }

    public void deleteMovieById(String imdbId){
       movieRepository.deleteMovieByImdbId(imdbId);

    }

//    public void save(Movie movie){
//        movieRepository.save();
//    }

}
















