package com.local.progettoquery.dto.persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaResponseDTO {

    private Long id;
    private String nome;
    private String cognome;
    private int eta;
    private double altezza;
}
