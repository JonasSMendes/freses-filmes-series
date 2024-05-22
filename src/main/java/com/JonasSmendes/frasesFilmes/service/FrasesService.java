package com.JonasSmendes.frasesFilmes.service;

import com.JonasSmendes.frasesFilmes.dto.FrasesDTO;
import com.JonasSmendes.frasesFilmes.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class FrasesService {
    @Autowired
    private FrasesRepository repository;
    public FrasesDTO encontrandoFrase() {

       return repository.fraseAleatoria()
                .map(f -> new FrasesDTO(f.getFrase(), f.getPersonagem(),f.getTitulo(),f.getPoster()))
               .orElseThrow(() -> new RuntimeException());
    }
}
