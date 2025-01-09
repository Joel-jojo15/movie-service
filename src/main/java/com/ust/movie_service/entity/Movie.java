package com.ust.movie_service.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	@NotNull
	private int movieId;
	
	@Column
	@NotBlank
	private String movieTitle;
	
	@Column
	private String movieLanguage;
	
	@Column
	private LocalDate movieReleaseDate;
	
	@Column
	@NotNull
	private String movieImageUrl;

}
