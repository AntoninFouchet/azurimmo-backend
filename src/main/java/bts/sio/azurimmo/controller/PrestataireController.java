package bts.sio.azurimmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bts.sio.azurimmo.dto.PrestataireDTO;
import bts.sio.azurimmo.model.Prestataire;
import bts.sio.azurimmo.service.PrestataireService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/prestataires")
@CrossOrigin("*")
@Tag(name = "Prestataire", description = "API pour la gestion des prestataires")
public class PrestataireController {

    @Autowired
    private PrestataireService prestataireService;

    @PostMapping("/")
    @Operation(summary = "Ajouter un prestataire")
    public Prestataire createPrestataire(@RequestBody Prestataire prestataire) {
        return prestataireService.savePrestataire(prestataire);
    }

    @GetMapping("/")
    @Operation(summary = "Lister tous les prestataires")
    public List<PrestataireDTO> getAllPrestataires() {
        return prestataireService.getAllPrestataires();
    }
}