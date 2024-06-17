package com.local.progettoquery.dto.casa;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CasaRequestDTO {

    private String indirizzo;
    private double grandezza;
}
