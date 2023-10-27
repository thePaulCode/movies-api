package dev.thepaulcode.movies;

import dev.thepaulcode.movies.model.movie.Movie;
import dev.thepaulcode.movies.service.reviewservice.ReviewService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication

public abstract class MoviesApplication extends ReviewService {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}



}
