package giadatonni.PROGETTO_SETTIMANALE_S17.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Postazione {

    @Id
    @GeneratedValue
    @Column(name = "postazione_id")
    private UUID postazioneId;

    @Column(nullable = false)
    private String descrizione;

    @Column(name = "tipo_postazione", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoPostazione tipoPostazione;

    @Column(name = "max_persone", nullable = false)
    private int maxPersone;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;

    public Postazione(String descrizione, TipoPostazione tipoPostazione, int maxPersone, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipoPostazione = tipoPostazione;
        this.maxPersone = maxPersone;
        this.edificio = edificio;
    }
}
