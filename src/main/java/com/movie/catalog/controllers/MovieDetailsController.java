package com.movie.catalog.controllers;

import com.movie.catalog.service.MovieDetailsService;
import com.movie.catalog.service.dtos.CreateUpdateMovieDetailsDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/movie-details")
@RequiredArgsConstructor
@Slf4j
public class MovieDetailsController {

    private final MovieDetailsService movieDetailsService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody CreateUpdateMovieDetailsDTO dto){
        System.out.println("ok");
        return ResponseEntity.ok(movieDetailsService.save(dto));
    }
}