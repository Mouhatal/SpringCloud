package sn.gaaynako.location.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Modele implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idModele;
    private String modele;
    private String anneeModele;
    @ManyToOne
    @JoinColumn(name="idMarque", nullable=false)
    private Marque marque;
    /*@OneToMany( targetEntity=Voiture.class, mappedBy="modele" )
    private List<Voiture> marques = new ArrayList<>();*/
}
