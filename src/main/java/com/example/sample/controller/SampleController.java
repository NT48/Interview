package com.example.sample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.model.MovieResponse;
import com.example.sample.service.SampleService;

import java.util.*;

@RestController
@RequestMapping("/movies")
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	
	@GetMapping("/getAllScores")
	public ResponseEntity<List<MovieResponse>> getAllScores(){
		List<MovieResponse> response = service.getAllScores();
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

}
