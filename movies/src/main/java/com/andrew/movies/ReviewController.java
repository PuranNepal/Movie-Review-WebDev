package com.andrew.movies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> creatReviewMethod(@RequestBody Map<String, String> payload) {        
        return new ResponseEntity<Review>(reviewService.creatReview(payload.get("reviewBody"), 
            payload.get("imdbId")), HttpStatus.OK);
    }
    
}
