package com.example.www.sample.domain.service;

import com.example.www.sample.domain.model.Review;

import java.util.List;

public interface ReviewsTestService {

    Review getReviewById(String reviewId);

    List<Review> getReviewsByUser(String userId, String brand);

    Review updateReview(String reviewId, Review review);

    void submitReview(Review review);

    void deleteReview(String reviewId);
}
