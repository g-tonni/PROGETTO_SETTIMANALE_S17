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

        // ****************** TEST SULLE CRUD CONCLUSI, INSERISCO ALTRI DATI

        /*edificiService.save("Palazzo Grande", "Via Roma", "Milano");
        edificiService.save("Accademia degli studi", "Via del Corso", "Roma");
        edificiService.save("Università di Filosofia", "Via Firenze", "Firenze");
        edificiService.save("Azienda", "Via Napoli", "Napoli");
        edificiService.save("Palazzaccio", "Piazza Cavour", "Roma");*/

       /* utentiService.save("martina11", "Martina Verdi", "martina@martina.com");
        utentiService.save("luca9", "Luca Rossi", "luca@luca.com");
        utentiService.save("giada21", "Giada Tonni", "giada@giada.com");
        utentiService.save("diego22", "Diego Bianchi", "diego@diego.com");*/

        /*try {
            postazioniService.save("49247ef1-2930-4626-b615-0d4936f55f11", "Ufficio con computer", TipoPostazione.PRIVATO, 6);
            postazioniService.save("49247ef1-2930-4626-b615-0d4936f55f11", "Sala Grande", TipoPostazione.OPENSPACE, 20);
            postazioniService.save("60f35baa-dca4-4609-a2bc-70181865e1e7", "Sala con proiettore", TipoPostazione.SALA_RIUNIONI, 20);
            postazioniService.save("60f35baa-dca4-4609-a2bc-70181865e1e7", "Sala con tavola tonda", TipoPostazione.PRIVATO, 10);
            postazioniService.save("68693d26-2d34-4adb-b5ec-b53ad9215d56", "Sala Piccola", TipoPostazione.PRIVATO, 4);
            postazioniService.save("68693d26-2d34-4adb-b5ec-b53ad9215d56", "Ufficio con monitor grandi", TipoPostazione.OPENSPACE, 10);
            postazioniService.save("73b30695-d243-462f-ba1a-6b0e91300c3c", "Grande sala", TipoPostazione.SALA_RIUNIONI, 20);
            postazioniService.save("7f2da265-2765-4282-b80d-207a4e66168d", "Studio con proiettore", TipoPostazione.PRIVATO, 4);
            postazioniService.save("7f2da265-2765-4282-b80d-207a4e66168d", "Studio", TipoPostazione.PRIVATO, 8);
            // System.out.println(postazioniService.findById("f9408575-a170-41bc-a590-a112fd1dcde5"));
        } catch (NotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IllegalArgumentException ex){
            System.out.println("Id non valido");
        } catch (ValidationException ex){
            System.out.println(ex.getMessage());
        }*/

        /*try {
            prenotazioniService.save(LocalDate.of(2026, 2, 10), 18, "009011d2-19aa-4b8b-9756-ea221d22a472", "563689b7-b812-4589-9c29-ddaed16a87aa");
            prenotazioniService.save(LocalDate.of(2026, 3, 11), 19, "3eb3bb4b-5bcf-497c-a663-18edd6b6f4fb", "a4c6adce-cbd8-48d2-8698-76a58ddc7ede");
            prenotazioniService.save(LocalDate.of(2026, 5, 12), 4,  "507dee30-6a22-4e47-b346-00e10263b15e", "c88711af-be1a-4821-84d9-36303a8bfb56");
            prenotazioniService.save(LocalDate.of(2026, 10, 13), 6,  "57395698-ace0-4528-8c2f-b6db56fd1751", "dcf48f0a-a115-468a-bc92-c73a0eca6de1");
            prenotazioniService.save(LocalDate.of(2026, 12, 15), 9,  "7647e1de-f17b-44c3-a7b5-51a9ea1c40eb", "563689b7-b812-4589-9c29-ddaed16a87aa");
            prenotazioniService.save(LocalDate.of(2026, 7, 16), 7,  "7d19ee0e-1507-4473-a2f3-571577610fba", "a4c6adce-cbd8-48d2-8698-76a58ddc7ede");
            prenotazioniService.save(LocalDate.of(2026, 8, 17), 19, "9404606d-5181-47d2-a46c-79f34b3b1669", "c88711af-be1a-4821-84d9-36303a8bfb56");
            prenotazioniService.save(LocalDate.of(2026, 8, 18), 4,  "df1f660c-76ca-4cc0-9569-fa708cb1d1f0", "dcf48f0a-a115-468a-bc92-c73a0eca6de1");
            prenotazioniService.save(LocalDate.of(2026, 11, 20), 9, "ffb5785d-f623-45f8-ba88-97f3d8a2483d", "563689b7-b812-4589-9c29-ddaed16a87aa");
            prenotazioniService.save(LocalDate.of(2026, 2, 21), 17, "009011d2-19aa-4b8b-9756-ea221d22a472", "a4c6adce-cbd8-48d2-8698-76a58ddc7ede");
            prenotazioniService.save(LocalDate.of(2026, 4, 22), 18, "3eb3bb4b-5bcf-497c-a663-18edd6b6f4fb", "c88711af-be1a-4821-84d9-36303a8bfb56");
            prenotazioniService.save(LocalDate.of(2026, 5, 23), 3,  "507dee30-6a22-4e47-b346-00e10263b15e", "dcf48f0a-a115-468a-bc92-c73a0eca6de1");
            prenotazioniService.save(LocalDate.of(2026, 6, 25), 5,  "57395698-ace0-4528-8c2f-b6db56fd1751", "563689b7-b812-4589-9c29-ddaed16a87aa");
            prenotazioniService.save(LocalDate.of(2026, 6, 26), 10, "7647e1de-f17b-44c3-a7b5-51a9ea1c40eb", "a4c6adce-cbd8-48d2-8698-76a58ddc7ede");
            prenotazioniService.save(LocalDate.of(2026, 7, 27), 8,  "7d19ee0e-1507-4473-a2f3-571577610fba", "c88711af-be1a-4821-84d9-36303a8bfb56");
            prenotazioniService.save(LocalDate.of(2026, 2, 28), 20, "9404606d-5181-47d2-a46c-79f34b3b1669", "dcf48f0a-a115-468a-bc92-c73a0eca6de1");
            prenotazioniService.save(LocalDate.of(2026, 3, 1), 3,  "df1f660c-76ca-4cc0-9569-fa708cb1d1f0", "563689b7-b812-4589-9c29-ddaed16a87aa");
            prenotazioniService.save(LocalDate.of(2026, 4, 2), 9,  "ffb5785d-f623-45f8-ba88-97f3d8a2483d", "a4c6adce-cbd8-48d2-8698-76a58ddc7ede");
            prenotazioniService.save(LocalDate.of(2026, 8, 3), 19, "009011d2-19aa-4b8b-9756-ea221d22a472", "c88711af-be1a-4821-84d9-36303a8bfb56");
            prenotazioniService.save(LocalDate.of(2026, 3, 4), 18, "3eb3bb4b-5bcf-497c-a663-18edd6b6f4fb", "dcf48f0a-a115-468a-bc92-c73a0eca6de1");

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
