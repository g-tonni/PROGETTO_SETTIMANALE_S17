package giadatonni.PROGETTO_SETTIMANALE_S17.repositories;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Postazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PostazioniRepository extends JpaRepository<Postazione, UUID> {

    List<Postazione> findByTipoPostazione(TipoPostazione tipoPostazione);

    @Query("SELECT p FROM Postazione p WHERE LOWER(p.edificio.citta) = LOWER(:citta)")
    List<Postazione> findByCitta(String citta);

    @Query("SELECT p FROM Postazione p WHERE LOWER(p.edificio.citta) = LOWER(:citta) AND p.tipoPostazione = :tipoPostazione")
    List<Postazione> findByCittaAndTipoPostazione(String citta, TipoPostazione tipoPostazione);
}
