package bts.sio.azurimmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bts.sio.azurimmo.dto.GerantDTO;
import bts.sio.azurimmo.model.Gerant;
import bts.sio.azurimmo.service.GerantService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/gerants")
@CrossOrigin(origins = "http://localhost:5173")
@Tag(name = "Gérant", description = "API pour la gestion des gérants")
public class GerantController {

    @Autowired
    private GerantService gerantService;

    @PostMapping("/")
    @Operation(summary = "Ajouter un gérant")
    public Gerant createGerant(@RequestBody Gerant gerant) {
        return gerantService.saveGerant(gerant);
    }

    @GetMapping("/")
    @Operation(summary = "Lister tous les gérants")
    public List<GerantDTO> getAllGerants() {
        return gerantService.getAllGerants();
    }
}