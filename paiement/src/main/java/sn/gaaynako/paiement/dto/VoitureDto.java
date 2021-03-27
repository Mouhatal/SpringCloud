package sn.gaaynako.paiement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VoitureDto {


    private Long idVoiture;
    private String couleur;
    private  int puissance;
    private String marque;
    private String modele;
}
