package com.JonasSmendes.frasesFilmes.controller;

import com.JonasSmendes.frasesFilmes.dto.FrasesDTO;
import com.JonasSmendes.frasesFilmes.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/series")
public class FrasesController {

    @Autowired
    private FrasesService service;

    @GetMapping("/frases")
    public FrasesDTO FraseAleatoria(){
        return service.encontrandoFrase();
    }
}
