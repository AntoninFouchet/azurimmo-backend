package bts.sio.azurimmo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PrestataireDTO {
    private Long id;
    private String libelle;
    private String ville;
    private String cp;
    private String adresse;
    private String email;
    private String tel;
}