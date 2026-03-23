package bts.sio.azurimmo.mapper;

import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.dto.GerantDTO;

public class GerantMapper {

    public static GerantDTO toDTO(Gerant g) {
        if (g == null) return null;

        GerantDTO dto = new GerantDTO();
        dto.setId(g.getId());
        dto.setNom(g.getNom());
        dto.setPrenom(g.getPrenom());
        dto.setLibelle(g.getLibelle());
        dto.setTel(g.getTel());
        dto.setMail(g.getMail());
        return dto;
    }

    public static Gerant toEntity(GerantDTO dto) {
        if (dto == null) return null;

        Gerant g = new Gerant();
        g.setId(dto.getId());
        g.setNom(dto.getNom());
        g.setPrenom(dto.getPrenom());
        g.setLibelle(dto.getLibelle());
        g.setTel(dto.getTel());
        g.setMail(dto.getMail());
        return g;
    }
}