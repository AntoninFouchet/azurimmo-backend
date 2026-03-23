package bts.sio.azurimmo.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "intervention")
public class Intervention {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="libelle")
    private String libelle;

    @Column(name="description")
    private String description;

    @Column(name="date_debut")
    private LocalDate dateDebut;

    @Column(name="date_fin")
    private LocalDate dateFin;

    @Column(name="cout_intervention")
    private Float coutIntervention;

    @Column(name="statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "appartement_id")
    private Appartement appartement;

    @ManyToOne
    @JoinColumn(name = "prestataire_id")
    private Prestataire prestataire;

    @ManyToOne
    @JoinColumn(name = "type_intervention_id")
    private TypeIntervention typeIntervention;
}