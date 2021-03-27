package sn.gaaynako.paiement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private String dateDebut;
    private String dateFin;
    private String marque;
    private String modele;
    @ManyToOne
    @JoinColumn(name="idClient", nullable=false)
    private Client client;
}
