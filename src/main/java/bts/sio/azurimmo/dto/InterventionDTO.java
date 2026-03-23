package bts.sio.azurimmo.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InterventionDTO {
    private Long id;
    private String libelle;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Float coutIntervention;
    private String statut;

    private AppartementDTO appartement;
    private PrestataireDTO prestataire;
    private TypeInterventionDTO typeIntervention;
}