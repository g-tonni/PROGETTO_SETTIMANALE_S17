package giadatonni.PROGETTO_SETTIMANALE_S17.repositories;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EdificiRepository extends JpaRepository<Edificio, UUID> {
}
