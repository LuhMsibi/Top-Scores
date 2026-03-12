package com.lungisani.topscores.controller;

import com.lungisani.topscores.model.Score;
import com.lungisani.topscores.service.CsvService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {

    private final CsvService csvService;

    public ScoreController(CsvService csvService) {
        this.csvService = csvService;
    }

    @GetMapping("/top-scorers")
    public List<Score> getTopScorers() {
        return csvService.getTopScorers();
    }
}