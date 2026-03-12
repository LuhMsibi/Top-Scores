package com.lungisani.topscores.service;

import com.lungisani.topscores.model.Score;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvService {

    public List<Score> readScoresFromCSV() {

        List<Score> scores = new ArrayList<>();

        try {

            InputStream inputStream = getClass()
                    .getResourceAsStream("/data/TestData.csv");

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(inputStream));

            String line;

            reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                String firstName = data[0];
                String secondName = data[1];
                int score = Integer.parseInt(data[2]);

                Score player = new Score(
                        firstName,
                        secondName,
                        score
                );

                scores.add(player);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return scores;
    }
    public List<Score> getTopScorers() {

        List<Score> scores = readScoresFromCSV();

        int maxScore = 0;

        for (Score s : scores) {
            if (s.getScore() > maxScore) {
                maxScore = s.getScore();
            }
        }

        List<Score> topPlayers = new ArrayList<>();

        for (Score s : scores) {
            if (s.getScore() == maxScore) {
                topPlayers.add(s);
            }
        }

        return topPlayers;
    }
}