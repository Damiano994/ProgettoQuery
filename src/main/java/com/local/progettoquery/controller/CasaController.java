package com.local.progettoquery.controller;

import com.local.progettoquery.dto.casa.CasaResponseDTO;
import com.local.progettoquery.models.Casa;
import com.local.progettoquery.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// il RestController combina Controller e RestFul. si usa per comodità per eventuali errori poiche trasforma in risposte HTTP.
// con il controller normale non vengono serializzati le risposte JSON e da un errore
@RestController
@RequestMapping("/api")
public class CasaController {

    @Autowired
    private CasaService casaService;

    @GetMapping("/trova_casa")
    public List<CasaResponseDTO> trovaCasaByPersona (@RequestParam Long personaId) {
        return casaService.trovaCasaByPersona(personaId);
    }
}
