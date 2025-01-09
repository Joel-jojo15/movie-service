package com.ust.movie_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.movie_service.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie , Integer>{

}
