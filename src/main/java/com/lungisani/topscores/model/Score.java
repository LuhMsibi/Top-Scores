package com.lungisani.topscores.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String secondName;
    private int score;

    public Score() {
    }

    public Score(String firstName, String secondName, int score) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getScore() {
        return score;
    }

    public void setPlayerName(String playerName) {
        this.firstName = playerName;
    }

    public void setTeamName(String teamName) {
        this.secondName = teamName;
    }

    public void setScore(int score) {
        this.score = score;
    }
}