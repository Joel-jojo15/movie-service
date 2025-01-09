package com.ust.movie_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.movie_service.entity.Movie;
import com.ust.movie_service.service.MovieService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	MovieService movieService;
	
	@PostMapping("/movies")
	public ResponseEntity<Movie> addMovie(@RequestBody @Valid Movie movie){
		return new ResponseEntity<Movie>(movieService.addMovie(movie) , HttpStatus.OK);
	}
	
	@GetMapping("/movies")
	public ResponseEntity<List<Movie>> getAllMovies(){
		return new ResponseEntity<List<Movie>>(movieService.getAllMovies() , HttpStatus.OK);
	}
    
	@GetMapping("/movies/{mid}")
	public ResponseEntity<Movie> getAMovie(@PathVariable int mid){
		return new ResponseEntity<Movie>(movieService.getAMovie(mid) , HttpStatus.OK);
	}
	
	@DeleteMapping("/movies/{mid}")
	public ResponseEntity<Void> deleteAMovie(@PathVariable int mid){
		movieService.deleteMovie(mid);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping("/movies")
	public ResponseEntity<Movie> updateMovie(@RequestBody @Valid Movie movie){
		return new ResponseEntity<Movie>(movieService.updateMovie(movie) , HttpStatus.OK);
	}
	
}
