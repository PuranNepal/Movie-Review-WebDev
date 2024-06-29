package com.andrew.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRespository extends MongoRepository<Movie, ObjectId>{
    Optional<Movie> findByImdbId(String imdbId);
}
