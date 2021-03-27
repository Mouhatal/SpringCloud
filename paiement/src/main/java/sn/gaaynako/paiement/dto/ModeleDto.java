package sn.gaaynako.paiement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModeleDto {
    private Long idModele;
    private String modele;
    private String anneeModele;
    private MarqueDto marque;
}
