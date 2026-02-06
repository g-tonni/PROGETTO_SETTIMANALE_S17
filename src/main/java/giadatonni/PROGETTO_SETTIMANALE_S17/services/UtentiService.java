package giadatonni.PROGETTO_SETTIMANALE_S17.services;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Edificio;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Utente;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.NotFoundException;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.ValidationException;
import giadatonni.PROGETTO_SETTIMANALE_S17.repositories.UtentiRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UtentiService {

    private final UtentiRepository utentiRepository;

    public UtentiService(UtentiRepository utentiRepository) {
        this.utentiRepository = utentiRepository;
    }

    public void save(String username, String nomeECognome, String email){
        Utente utente = new Utente(username, nomeECognome, email);
        if(this.findByEmail(email).size() > 0) throw new ValidationException("Email già esistente");
        utentiRepository.save(utente);
        System.out.println("Utente salvato correttamente");
    }

    public Utente findById(String utenteId){
        return utentiRepository.findById(UUID.fromString(utenteId)).orElseThrow(() -> new NotFoundException(utenteId));
    }

    public List<Utente> findByEmail(String email){
        return utentiRepository.findByEmail(email);
    }
}
