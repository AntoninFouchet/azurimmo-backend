package bts.sio.azurimmo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.dto.PrestataireDTO;
import bts.sio.azurimmo.mapper.PrestataireMapper;
import bts.sio.azurimmo.model.Prestataire;
import bts.sio.azurimmo.repository.PrestataireRepository;

@Service
public class PrestataireService {

    @Autowired
    private PrestataireRepository prestataireRepository;

    public Prestataire savePrestataire(Prestataire prestataire) {
        return prestataireRepository.save(prestataire);
    }

    public List<PrestataireDTO> getAllPrestataires() {
        return prestataireRepository.findAll().stream()
                .map(PrestataireMapper::toDTO)
                .collect(Collectors.toList());
    }
}