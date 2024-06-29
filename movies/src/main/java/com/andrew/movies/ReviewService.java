package com.andrew.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRespository reviewRespository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review creatReview(String reviewBody, String imdbId){
        Review review = reviewRespository.insert(new Review(reviewBody));
        mongoTemplate.update(Movie.class)
            .matching(Criteria.where("imdbId").is(imdbId))
            .apply(new Update().push("reviewIds").value(review.getId()))
            .first();

        return review;
    }


}
