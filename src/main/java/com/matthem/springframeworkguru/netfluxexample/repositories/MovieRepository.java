package com.matthem.springframeworkguru.netfluxexample.repositories;

import com.matthem.springframeworkguru.netfluxexample.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
