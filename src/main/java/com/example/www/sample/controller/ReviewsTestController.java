package com.example.www.sample.controller;

import com.example.www.sample.domain.model.Review;
import com.example.www.sample.domain.service.ReviewsTestService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReviewsTestController {
    private final ReviewsTestService reviewsTestService;

    public ReviewsTestController(@Qualifier("reviewsServiceV1") ReviewsTestService reviewsTestService) {
        this.reviewsTestService = reviewsTestService;
    }

    @GetMapping(value = "/review/{review-id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Review getReviewById(@PathVariable("review-id") String reviewId) {
        return reviewsTestService.getReviewById(reviewId);
    }

    @GetMapping(value = "/user/{user-id}/reviews", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Review> getReviewsByUserId(@PathVariable("user-id") String userId,
                                        @RequestParam("brand") String brand) {
        return reviewsTestService.getReviewsByUser(userId, brand);
    }

    @PostMapping(value = "/review", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void submitReview(@RequestBody Review review) {
        reviewsTestService.submitReview(review);
    }

    @PutMapping(
            value = "/review/{review-id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Review updateReview(@PathVariable("review-id") String reviewId,
                               @RequestBody Review review) {
        return reviewsTestService.updateReview(reviewId, review);
    }

    @DeleteMapping("/review/{review-id}")
    public void deleteReview(@PathVariable("review-id") String reviewId) {
        reviewsTestService.deleteReview(reviewId);
    }
 }
