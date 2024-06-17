package com.local.progettoquery.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersona;

    @Column
    private String nome;

    @Column
    private String cognome;

    @Column
    private int eta;

    @Column
    private double altezza;


    // una persona puo avere piu case
    @OneToMany(mappedBy = "persona")
    private List<Casa> listaCase;


}
