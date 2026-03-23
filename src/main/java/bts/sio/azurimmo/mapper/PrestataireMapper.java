package bts.sio.azurimmo.mapper;

import bts.sio.azurimmo.model.Prestataire;
import bts.sio.azurimmo.dto.PrestataireDTO;

public class PrestataireMapper {

    public static PrestataireDTO toDTO(Prestataire p) {
        if (p == null) return null;

        PrestataireDTO dto = new PrestataireDTO();
        dto.setId(p.getId());
        dto.setLibelle(p.getLibelle());
        dto.setVille(p.getVille());
        dto.setCp(p.getCp());
        dto.setAdresse(p.getAdresse());
        dto.setEmail(p.getEmail());
        dto.setTel(p.getTel());
        return dto;
    }

    public static Prestataire toEntity(PrestataireDTO dto) {
        if (dto == null) return null;

        Prestataire p = new Prestataire();
        p.setId(dto.getId());
        p.setLibelle(dto.getLibelle());
        p.setVille(dto.getVille());
        p.setCp(dto.getCp());
        p.setAdresse(dto.getAdresse());
        p.setEmail(dto.getEmail());
        p.setTel(dto.getTel());
        return p;
    }
}