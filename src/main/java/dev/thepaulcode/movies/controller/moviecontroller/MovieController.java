package dev.thepaulcode.movies.controller.moviecontroller;

import dev.thepaulcode.movies.model.movie.Movie;
import dev.thepaulcode.movies.service.movieservice.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "", allowedHeaders = "", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class MovieController {
    @Autowired
    private MovieService movieService;
    // Obter todos os filmes existentes no DB

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        //return new ResponseEntity<String>("All Movies", HttpStatus.OK);
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }
    // Obter filme por imdbId
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable("imdbId") String imdbId){

        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
    // Deletar filme por imdbId
    @DeleteMapping("/{imdbId}")
    public void deleteMovieById(@PathVariable String imdbId){

        movieService.deleteMovieById(imdbId);
    }
    // Inserir um novo filme no DB
    @PutMapping
    public void putMovie(@RequestBody Movie movie){
        movieService.saveMovie(movie);
    }

}

