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
public class Marque implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idMarque;
    private String marque;
    /*@OneToMany( targetEntity=Modele.class, mappedBy="marque" )
    private List<Marque> marques = new ArrayList<>();*/

}
