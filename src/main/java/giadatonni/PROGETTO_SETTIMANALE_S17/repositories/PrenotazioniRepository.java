package giadatonni.PROGETTO_SETTIMANALE_S17.repositories;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Postazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Prenotazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.TipoPostazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Repository
public interface PrenotazioniRepository extends JpaRepository<Prenotazione, UUID> {

    List<Prenotazione> findByUtenteAndDataPrenotazione(Utente utente, LocalDate dataPrenotazione);

    List<Prenotazione> findByPostazioneAndDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione);

    @Query("SELECT p FROM Prenotazione p WHERE p.utente.utenteId = :utenteId")
    List<Prenotazione> findByUtenteId(UUID utenteId);

    @Query("SELECT p FROM Prenotazione p WHERE p.postazione.postazioneId = :postazioneId AND p.dataPrenotazione = :data")
    List<Prenotazione> findByPostazioneIdAndData(UUID postazioneId, LocalDate data);
}
