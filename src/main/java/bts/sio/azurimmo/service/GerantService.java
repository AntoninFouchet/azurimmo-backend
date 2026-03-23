package bts.sio.azurimmo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bts.sio.azurimmo.dto.GerantDTO;
import bts.sio.azurimmo.mapper.GerantMapper;
import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.repository.GerantRepository;

@Service
public class GerantService {

    @Autowired
    private GerantRepository gerantRepository;

    public Gerant saveGerant(Gerant gerant) {
        return gerantRepository.save(gerant);
    }

    public List<GerantDTO> getAllGerants() {
        return gerantRepository.findAll().stream()
                .map(GerantMapper::toDTO)
                .collect(Collectors.toList());
    }
}