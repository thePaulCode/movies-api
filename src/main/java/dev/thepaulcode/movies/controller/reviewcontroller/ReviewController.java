package dev.thepaulcode.movies.controller.reviewcontroller;

import dev.thepaulcode.movies.model.review.Review;
import dev.thepaulcode.movies.service.reviewservice.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/reviews")
@CrossOrigin(origins = "", allowedHeaders = "", methods = {RequestMethod.POST})
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payLoad){
        return new ResponseEntity<Review>(reviewService.createReview(payLoad.get("reviewBody"), payLoad.get("imdbId")), HttpStatus.CREATED);

    }

}
