package giadatonni.PROGETTO_SETTIMANALE_S17.runners;

import giadatonni.PROGETTO_SETTIMANALE_S17.exceptions.NotFoundException;
import giadatonni.PROGETTO_SETTIMANALE_S17.services.EdificiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final EdificiService edificiService;

    public MyRunner(EdificiService edificiService) {
        this.edificiService = edificiService;
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

    }
}
