package com.local.progettoquery.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Casa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCasa;

    @Column
    private String indirizzoCasa;

    @Column
    private double grandezzaCasa;


    // una casa puo avere solo una persona
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;
}
