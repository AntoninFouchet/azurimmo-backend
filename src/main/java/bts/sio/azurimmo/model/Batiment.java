package bts.sio.azurimmo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "batiment")
public class Batiment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="adresse")
    private String adresse;

    @Column(name="ville")
    private String ville;

    @OneToMany(mappedBy = "batiment")
    private List<Appartement> appartements;

    @ManyToOne
    @JoinColumn(name = "gerant_id")
    private Gerant gerant;
}