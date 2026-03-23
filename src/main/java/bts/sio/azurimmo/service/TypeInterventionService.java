package bts.sio.azurimmo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.dto.TypeInterventionDTO;
import bts.sio.azurimmo.mapper.TypeInterventionMapper;
import bts.sio.azurimmo.model.TypeIntervention;
import bts.sio.azurimmo.repository.TypeInterventionRepository;

@Service
public class TypeInterventionService {

    @Autowired
    private TypeInterventionRepository typeInterventionRepository;

    public TypeIntervention saveTypeIntervention(TypeIntervention typeIntervention) {
        return typeInterventionRepository.save(typeIntervention);
    }

    public List<TypeInterventionDTO> getAllTypeInterventions() {
        return typeInterventionRepository.findAll().stream()
                .map(TypeInterventionMapper::toDTO)
                .collect(Collectors.toList());
    }
}