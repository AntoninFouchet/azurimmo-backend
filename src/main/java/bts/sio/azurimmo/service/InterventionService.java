package bts.sio.azurimmo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.dto.InterventionDTO;
import bts.sio.azurimmo.mapper.InterventionMapper;
import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.repository.InterventionRepository;

@Service
public class InterventionService {

    @Autowired
    private InterventionRepository interventionRepository;

    public Intervention saveIntervention(Intervention intervention) {
        return interventionRepository.save(intervention);
    }

    public List<InterventionDTO> getAllInterventions() {
        return interventionRepository.findAll().stream()
                .map(InterventionMapper::toDTO)
                .collect(Collectors.toList());
    }
}