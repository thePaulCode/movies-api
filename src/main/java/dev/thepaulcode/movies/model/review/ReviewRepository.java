package dev.thepaulcode.movies.model.review;

import dev.thepaulcode.movies.model.review.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
    
}
