package giadatonni.PROGETTO_SETTIMANALE_S17.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "postazioni")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Postazione {

    @Id
    @GeneratedValue
    @Column(name = "postazione_id")
    private UUID postazioneId;

    @Column(nullable = false)
    private String descrizione;

    @Column(name = "tipo_postazione", nullable = false)
    private TipoPostazione tipoPostazione;

    @Column(name = "max_persone", nullable = false)
    private int maxPersone;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;
}
