package com.example.demo.entity;


import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "reviews")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewModel {
    private int stars;
    private String description;
    private int userId;
    private int eventId;
    private Date createTime;
}