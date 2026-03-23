package bts.sio.azurimmo.mapper;

import bts.sio.azurimmo.model.TypeIntervention;
import bts.sio.azurimmo.dto.TypeInterventionDTO;

public class TypeInterventionMapper {

    public static TypeInterventionDTO toDTO(TypeIntervention t) {
        if (t == null) return null;

        TypeInterventionDTO dto = new TypeInterventionDTO();
        dto.setId(t.getId());
        dto.setLibelle(t.getLibelle());
        return dto;
    }

    public static TypeIntervention toEntity(TypeInterventionDTO dto) {
        if (dto == null) return null;

        TypeIntervention t = new TypeIntervention();
        t.setId(dto.getId());
        t.setLibelle(dto.getLibelle());
        return t;
    }
}