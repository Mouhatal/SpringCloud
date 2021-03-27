package sn.gaaynako.location.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Voiture implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idVoiture;
    private String couleur;
    private  int puissance;
    private String marque;
    private String modele;
    /*@ManyToOne
    @JoinColumn(name="idModele", nullable=false)
    private Modele modele;
    @ManyToOne
    @JoinColumn(name="idCarburant", nullable=false)
    private Carburant carburant;*/
}
