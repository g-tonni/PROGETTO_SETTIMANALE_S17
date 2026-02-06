package giadatonni.PROGETTO_SETTIMANALE_S17.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "edifici")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Edificio {

    @Id
    @GeneratedValue
    @Column(name = "edificio_id")
    private UUID edificioId;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String indirizzo;

    @Column(nullable = false)
    private String citta;
}
