package giadatonni.PROGETTO_SETTIMANALE_S17.services;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Edificio;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.NotFoundException;
import giadatonni.PROGETTO_SETTIMANALE_S17.repositories.EdificiRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EdificiService {

    private final EdificiRepository edificiRepository;

    public EdificiService(EdificiRepository edificiRepository) {
        this.edificiRepository = edificiRepository;
    }

    public void save(String nome, String indirizzo, String città){
        Edificio edificio = new Edificio(nome, indirizzo, città);
        edificiRepository.save(edificio);
        System.out.println("Edificio salvato correttamente");
    }

    public Edificio findById(String edificioId){
        return edificiRepository.findById(UUID.fromString(edificioId)).orElseThrow(() -> new NotFoundException(edificioId));
    }
}
