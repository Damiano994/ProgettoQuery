package com.local.progettoquery.repository;

import com.local.progettoquery.dto.casa.CasaResponseDTO;
import com.local.progettoquery.models.Casa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CasaRepository extends JpaRepository<Casa, Long> {

    // @Query : identifica di creare una query manuale
    // Select new com.local.progettoquery.dto.casa.CasaResponseDTO : istruiamo Spring Data JPA a creare nuovi oggetti CasaResponseDTO direttamente nella query
    // new com.local.progettoquery.dto.casa.CasaResponseDTO: specifico la classe DTO che voglio popolare con i dati estratti dalla Query
    //(c.idCasa, c.indirizzoCasa, c.grandezzaCasa): Specifica i campi della classe CasaResponseDTO che devono essere popolati.
    // Questi campi devono corrispondere ai campi selezionati nella query SQL.
    //FROM Casa c: Specifica l'entità del database Casa (presumibilmente mappata a una tabella nel database) e assegna un alias c per utilizzarla nella query.
    //WHERE c.persona.idPersona = :personaId: Applica un filtro per recuperare solo le istanze di Casa in cui l'ID della persona corrisponde
    // al parametro personaId fornito alla query.
    //List<CasaResponseDTO>: Indica che il metodo restituirà una lista di oggetti CasaResponseDTO, non una lista di entità Casa.

    @Query("Select new com.local.progettoquery.dto.casa.CasaResponseDTO(c.idCasa,c.indirizzoCasa,c.grandezzaCasa)" +
            "FROM Casa c " +
            "WHERE c.persona.idPersona = :personaId")
    List<CasaResponseDTO> findByPersonaId(@Param("personaId") Long personaId);
}


