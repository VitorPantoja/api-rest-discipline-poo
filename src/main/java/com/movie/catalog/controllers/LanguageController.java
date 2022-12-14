package com.movie.catalog.controllers;

import com.movie.catalog.service.LanguageService;
import com.movie.catalog.service.dtos.LanguageDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/languages")
@RequiredArgsConstructor
@Slf4j
public class LanguageController {

    private final LanguageService languageService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody LanguageDTO dto){
        return ResponseEntity.ok(languageService.save(dto));
    }
}
