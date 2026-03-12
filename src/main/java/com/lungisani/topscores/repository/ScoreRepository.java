package com.lungisani.topscores.repository;


import com.lungisani.topscores.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findByFirstNameAndSecondName(String firstName, String secondName);
}
