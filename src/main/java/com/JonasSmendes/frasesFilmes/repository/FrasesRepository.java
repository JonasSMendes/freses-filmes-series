package com.JonasSmendes.frasesFilmes.repository;


import com.JonasSmendes.frasesFilmes.model.Frases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FrasesRepository extends JpaRepository<Frases, Long> {

    @Query("SELECT f FROM Frases f order by function('RANDOM') LIMIT 1")
    Optional<Frases> fraseAleatoria();
}
