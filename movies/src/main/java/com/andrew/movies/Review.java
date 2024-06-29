package com.andrew.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data //creates getter  and setter for the attributes
@AllArgsConstructor //creates constructors with all the arguements
@NoArgsConstructor //creates empty constructors
public class Review {
    @Id
    private ObjectId id;
    private String body;


    public Review(String body) {
        this.body = body;
    }

}
