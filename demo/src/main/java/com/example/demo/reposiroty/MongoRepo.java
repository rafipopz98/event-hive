package com.example.demo.reposiroty;

import com.example.demo.entity.ReviewModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRepo extends MongoRepository<ReviewModel,String> {
}
