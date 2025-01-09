package com.ust.movie_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.movie_service.entity.Movie;
import com.ust.movie_service.repository.MovieRepo;

@Service
public class MovieService {
	
	@Autowired
	MovieRepo movieRepo;
	
	public Movie addMovie(Movie movie) {
		return movieRepo.saveAndFlush(movie);
	}
	
	public List<Movie> getAllMovies(){
		return movieRepo.findAll();
	}
	
	public Movie getAMovie(int movieId) {
		Optional<Movie> opt = movieRepo.findById(movieId);
		Movie m = null;
		if(opt.isPresent()) {
			m =  opt.get();
		}
		return m;
	}
	
	public Movie updateMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	
	public void deleteMovie(int id) {
		movieRepo.deleteById(id);
	}

}
