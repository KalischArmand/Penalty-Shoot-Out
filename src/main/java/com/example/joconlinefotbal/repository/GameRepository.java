package com.example.joconlinefotbal.repository;

import com.example.joconlinefotbal.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
    // Metode
}
