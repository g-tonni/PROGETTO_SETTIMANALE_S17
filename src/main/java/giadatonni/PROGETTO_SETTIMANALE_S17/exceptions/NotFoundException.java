package giadatonni.PROGETTO_SETTIMANALE_S17.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String id) {
        super("La risorsa con id " + id + " non è stata trovata");
    }
}
