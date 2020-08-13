package com.matthem.springframeworkguru.netfluxexample.service;

import com.matthem.springframeworkguru.netfluxexample.domain.Movie;
import com.matthem.springframeworkguru.netfluxexample.domain.MovieEvent;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieService {
  /**
   * Generate stream of movie events for given movie id
   *
   * @param movieId id of movie
   * @return Flux<MovieEvent>
   */
  Flux<MovieEvent> events(String movieId);

  /**
   * Get Movie by id
   *
   * @param id id of movie
   * @return Mono<Movie>
   */
  Mono<Movie> getMovieById(String id);

  /**
   * Return list of all movies
   *
   * @return Flux<Movie>
   */
  Flux<Movie> getAllMovies();
}
