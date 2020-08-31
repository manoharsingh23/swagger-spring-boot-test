package com.example.www.sample.domain.service;

import com.example.www.sample.domain.model.Review;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service("reviewsServiceV1")
public class ReviewsTestServiceV1 implements ReviewsTestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ReviewsTestServiceV1.class);

    private Map<String, Review> reviewsById = new HashMap<>();
    private Map<String, Set<Review>> reviewsByUser = new HashMap<>();

    @Override
    public Review getReviewById(String reviewId) {
        LOGGER.info("Review retrieved successfully for reviewId = {}", reviewId);
        return null;
    }

    @Override
    public List<Review> getReviewsByUser(String userId, String brand) {
        LOGGER.info("Reviews retrieved successfully for userId = {}, brand = {}", userId, brand);
        return null;
    }

    @Override
    public Review updateReview(String reviewId, Review review) {
        LOGGER.info("Review updated successfully for id ={}", reviewId);
        return null;
    }

    @Override
    public void submitReview(Review review) {
        LOGGER.info("Successfully submitted a review = {}", review);
    }

    @Override
    public void deleteReview(String reviewId) {
        LOGGER.info("Deleted a review with id = {}", reviewId);
    }
}
