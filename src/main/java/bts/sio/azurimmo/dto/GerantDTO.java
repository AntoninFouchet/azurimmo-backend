package bts.sio.azurimmo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GerantDTO {
    private Long id;
    private String nom;
    private String prenom;
    private String libelle;
    private String tel;
    private String mail;
}