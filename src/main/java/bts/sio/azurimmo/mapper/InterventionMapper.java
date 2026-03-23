package bts.sio.azurimmo.mapper;

import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.dto.InterventionDTO;

public class InterventionMapper {

    public static InterventionDTO toDTO(Intervention i) {
        if (i == null) return null;

        InterventionDTO dto = new InterventionDTO();
        dto.setId(i.getId());
        dto.setLibelle(i.getLibelle());
        dto.setDescription(i.getDescription());
        dto.setDateDebut(i.getDateDebut());
        dto.setDateFin(i.getDateFin());
        dto.setCoutIntervention(i.getCoutIntervention());
        dto.setStatut(i.getStatut());

        dto.setAppartement(AppartementMapper.toDTO(i.getAppartement()));
        dto.setPrestataire(PrestataireMapper.toDTO(i.getPrestataire()));
        dto.setTypeIntervention(TypeInterventionMapper.toDTO(i.getTypeIntervention()));

        return dto;
    }

    public static Intervention toEntity(InterventionDTO dto) {
        if (dto == null) return null;

        Intervention i = new Intervention();
        i.setId(dto.getId());
        i.setLibelle(dto.getLibelle());
        i.setDescription(dto.getDescription());
        i.setDateDebut(dto.getDateDebut());
        i.setDateFin(dto.getDateFin());
        i.setCoutIntervention(dto.getCoutIntervention());
        i.setStatut(dto.getStatut());

        i.setAppartement(AppartementMapper.toEntity(dto.getAppartement()));
        i.setPrestataire(PrestataireMapper.toEntity(dto.getPrestataire()));
        i.setTypeIntervention(TypeInterventionMapper.toEntity(dto.getTypeIntervention()));

        return i;
    }
}