package com.example.sample.service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.sample.model.Movie;
import com.example.sample.model.MovieResponse;

@Service
public class SampleService {

	@Autowired
	RestTemplate restTemplate;
	
	public List<MovieResponse> getAllScores() {
		ResponseEntity<Movie[]> response  = restTemplate.getForEntity("https://ghibliapi.herokuapp.com/films",Movie[].class);
		Comparator<MovieResponse> comparator = Comparator.comparingInt(MovieResponse::getScore).reversed();
		List<Movie> movies = Arrays.asList(response.getBody());
		return movies.stream().map(m -> new MovieResponse(m.getTitle(), m.getRt_score())).sorted(comparator).collect(Collectors.toList());
	}

}
