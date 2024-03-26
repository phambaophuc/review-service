package org.pbp.reviewservice.repository;

import org.pbp.reviewservice.document.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends MongoRepository<Review, String> {

    List<Review> findTop6ByOrderByCreatedAtDesc();
}
