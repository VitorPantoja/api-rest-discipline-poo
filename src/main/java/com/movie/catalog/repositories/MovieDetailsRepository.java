package com.movie.catalog.repositories;

import com.movie.catalog.models.MovieDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDetailsRepository extends JpaRepository <MovieDetails, Long> {
}
