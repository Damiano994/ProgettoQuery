package com.local.progettoquery.service;

import com.local.progettoquery.dto.casa.CasaResponseDTO;
import com.local.progettoquery.models.Casa;
import com.local.progettoquery.repository.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CasaService {

    @Autowired
    private CasaRepository casaRepository;

    // richiamo il metodo creato in casaRepository
    public List<CasaResponseDTO> trovaCasaByPersona(Long personaId) {
        List<CasaResponseDTO> listaCase = casaRepository.findByPersonaId(personaId);
        return listaCase;
    }


}
