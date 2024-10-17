package com.example.demo.controller;

import com.example.demo.entity.ReviewModel;
import com.example.demo.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @RequestMapping(value = "/allReviews")
    public List<ReviewModel> GetAllReviewsController() {
        return reviewService.getAllReviews();
    }

    @PostMapping(value = "/addReview")
    public String AddReviewController(@RequestBody ReviewModel review) {
        return reviewService.addReview(review);
    }

}
