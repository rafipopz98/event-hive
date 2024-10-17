package com.example.demo.services;

import com.example.demo.entity.ReviewModel;
import com.example.demo.reposiroty.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    MongoRepo reviewRepo;
    @Override
    public List<ReviewModel> getAllReviews() {
        return reviewRepo.findAll();
    }

    @Override
    public String addReview(ReviewModel review) {
        reviewRepo.save(review);
        return "Added Successfully";
    }
}
