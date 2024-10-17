package com.example.demo.services;

import com.example.demo.entity.ReviewModel;

import java.util.List;

public interface ReviewService {

    List<ReviewModel> getAllReviews();

    String addReview(ReviewModel review);
}
