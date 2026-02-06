package giadatonni.PROGETTO_SETTIMANALE_S17.services;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Postazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Prenotazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Utente;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.NotFoundException;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.ValidationException;
import giadatonni.PROGETTO_SETTIMANALE_S17.repositories.PrenotazioniRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Service
public class PrenotazioniService {
    private final PrenotazioniRepository prenotazioniRepository;
    private final UtentiService utentiService;
    private final PostazioniService postazioniService;

    public PrenotazioniService(PrenotazioniRepository prenotazioniRepository, UtentiService utentiService, PostazioniService postazioniService) {
        this.prenotazioniRepository = prenotazioniRepository;
        this.utentiService = utentiService;
        this.postazioniService = postazioniService;
    }

    public void save(LocalDate dataPrenotazione, int numeroPersone, String postazioneId, String utenteId){
        Postazione postazione = postazioniService.findById(postazioneId);
        
        if(numeroPersone < 1 || numeroPersone > postazione.getMaxPersone()) throw new ValidationException("Numero persone non valido");
        Utente utente = utentiService.findById(utenteId);
        if (this.findByUtenteEDataPrenotazione(utente, dataPrenotazione).size() > 0) throw new ValidationException("Una prenotazione per l'utente con id " + utenteId + " è già esistente nella data inserita");
        Prenotazione prenotazione = new Prenotazione(dataPrenotazione, numeroPersone, postazione, utente);
        prenotazioniRepository.save(prenotazione);
        System.out.println("Prenotazione salvata correttamente");
    }

    public Prenotazione findById(String prenotazioneId){
        return prenotazioniRepository.findById(UUID.fromString(prenotazioneId)).orElseThrow(() -> new NotFoundException(prenotazioneId));
    }

    public List<Prenotazione> findByUtenteEDataPrenotazione(Utente utente, LocalDate dataPrenotazione){
        return prenotazioniRepository.findByUtenteAndDataPrenotazione(utente, dataPrenotazione);
    }

    public List<Prenotazione> findByPostazioneEDataPrenotazione(Postazione postazione, LocalDate dataPrenotazione){
        return prenotazioniRepository.findByPostazioneAndDataPrenotazione(postazione, dataPrenotazione);
    }

}
