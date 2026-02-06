package giadatonni.PROGETTO_SETTIMANALE_S17.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "utenti")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Utente {

    @Id
    @GeneratedValue
    @Column(name = "utente_id")
    private UUID utenteId;

    @Column(nullable = false)
    private String username;

    @Column(name = "nome_cognome", nullable = false)
    private String nomeECognome;

    @Column(nullable = false)
    private String email;
}
