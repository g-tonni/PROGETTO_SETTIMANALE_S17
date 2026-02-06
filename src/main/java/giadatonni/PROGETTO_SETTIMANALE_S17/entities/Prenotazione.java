package giadatonni.PROGETTO_SETTIMANALE_S17.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "prenotazioni")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Prenotazione {

    @Id
    @GeneratedValue
    @Column(name = "prenotazione_id")
    private UUID prenotazioneId;

    @Column(name = "data_prenotazione", nullable = false)
    private LocalDate dataPrenotazione;

    @Column(name = "data_scadenza", nullable = false)
    private LocalDate dataScadenza;

    @Column(name = "numero_persone", nullable = false)
    private int numeroPersone;

    @ManyToOne
    @JoinColumn(name = "postazione_id", nullable = false)
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    public Prenotazione(LocalDate dataPrenotazione, int numeroPersone, Postazione postazione, Utente utente) {
        this.dataPrenotazione = dataPrenotazione;
        this.dataScadenza = dataPrenotazione.plusDays(1);
        this.numeroPersone = numeroPersone;
        this.postazione = postazione;
        this.utente = utente;
    }
}
