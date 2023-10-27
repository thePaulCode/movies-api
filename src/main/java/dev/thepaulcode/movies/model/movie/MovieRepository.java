package dev.thepaulcode.movies.model.movie;

import dev.thepaulcode.movies.model.movie.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    Optional<Movie> findMovieByImdbId(String imdbId);
    Optional<Movie> deleteMovieByImdbId(String imdbId);

//    Movie saveMovie()
}






















