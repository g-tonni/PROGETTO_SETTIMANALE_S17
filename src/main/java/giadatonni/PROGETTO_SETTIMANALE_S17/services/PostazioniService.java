package giadatonni.PROGETTO_SETTIMANALE_S17.services;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Edificio;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Postazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.TipoPostazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Utente;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.NotFoundException;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.ValidationException;
import giadatonni.PROGETTO_SETTIMANALE_S17.repositories.PostazioniRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PostazioniService {

    private final PostazioniRepository postazioniRepository;
    private final EdificiService edificiService;

    public PostazioniService(PostazioniRepository postazioniRepository, EdificiService edificiService) {
        this.postazioniRepository = postazioniRepository;
        this.edificiService = edificiService;
    }

    public void save(String edificioId, String descrizione, TipoPostazione tipoPostazione, int maxPersone){
        Edificio edificio = edificiService.findById(edificioId);
        if(maxPersone < 1 || maxPersone > 20) throw new ValidationException("Numero persone non valido");
        Postazione postazione = new Postazione(descrizione, tipoPostazione, maxPersone, edificio);
        postazioniRepository.save(postazione);
        System.out.println("Postazione salvata correttamente");
    }

    public Postazione findById(String postazioneId){
        return postazioniRepository.findById(UUID.fromString(postazioneId)).orElseThrow(() -> new NotFoundException(postazioneId));
    }
}
