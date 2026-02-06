package giadatonni.PROGETTO_SETTIMANALE_S17.repositories;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UtentiRepository extends JpaRepository<Utente, UUID> {

    List<Utente> findByEmail(String email);
}
