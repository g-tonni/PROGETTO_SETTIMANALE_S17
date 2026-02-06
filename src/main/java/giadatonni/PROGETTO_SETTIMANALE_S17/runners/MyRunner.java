package giadatonni.PROGETTO_SETTIMANALE_S17.runners;

import giadatonni.PROGETTO_SETTIMANALE_S17.entities.TipoPostazione;
import giadatonni.PROGETTO_SETTIMANALE_S17.entities.Utente;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.NotFoundException;
import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.ValidationException;
import giadatonni.PROGETTO_SETTIMANALE_S17.services.EdificiService;
import giadatonni.PROGETTO_SETTIMANALE_S17.services.PostazioniService;
import giadatonni.PROGETTO_SETTIMANALE_S17.services.PrenotazioniService;
import giadatonni.PROGETTO_SETTIMANALE_S17.services.UtentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements CommandLineRunner {

    private final EdificiService edificiService;
    private final UtentiService utentiService;
    private final PostazioniService postazioniService;
    private final PrenotazioniService prenotazioniService;

    public MyRunner(EdificiService edificiService, UtentiService utentiService, PostazioniService postazioniService, PrenotazioniService prenotazioniService) {
        this.edificiService = edificiService;
        this.utentiService = utentiService;
        this.postazioniService = postazioniService;
        this.prenotazioniService = prenotazioniService;
    }

    @Override
    public void run(String... args) throws Exception {

        // edificiService.save("Palazzaccio", "Piazza Cavour", "Roma");
        /*try {
          System.out.println(edificiService.findById("ca3a5f86-aeca-40a3-a862-566b624427b1"));
        } catch (NotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex){
            System.out.println("Id non valido");
        }*/

        // utentiService.save("giada21", "Giada Tonni", "giada@giada.com");
        /*try {
          // System.out.println(utentiService.findById("3a0e2706-109d-4fc3-9661-dc7fa8eef209"));
          // System.out.println(utentiService.findByEmail("giada@.com").size());

        } catch (NotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex){
            System.out.println("Id non valido");
        }*/
        /*try{
            utentiService.save("diego22", "Diego Bianchi", "diego@diego.com");
        } catch (ValidationException ex){
            System.out.println(ex.getMessage());
        }*/

        /*try {
           postazioniService.save("ca3a5f86-aeca-40a3-a862-566b624427b1", "Studio con proiettore", TipoPostazione.PRIVATO, 4);
          // System.out.println(postazioniService.findById("f9408575-a170-41bc-a590-a112fd1dcde5"));
        } catch (NotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex){
            System.out.println("Id non valido");
        } catch (ValidationException ex){
            System.out.println(ex.getMessage());
        }*/


        /*try {
           prenotazioniService.save(LocalDate.of(2026, 2, 25), 4, "d630ca64-c501-4eea-a82d-5a186d422263", "79ae002d-c7bb-4a7b-ad39-5cd0e93ad75a");
          // System.out.println(prenotazioniService.findById("afdad2b4-a8c9-42a0-a461-412a8bad6586"));
          // Utente utente = utentiService.findById("3a0e2706-109d-4fc3-9661-dc7fa8eef209");
          // prenotazioniService.findByUtenteEDataPrenotazione(utente, LocalDate.of(2026, 1, 25)).forEach(System.out::println);
        } catch (NotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex){
            System.out.println("Id non valido");
        } catch (ValidationException ex){
            System.out.println(ex.getMessage());
        }*/



    }
}
