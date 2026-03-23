package bts.sio.azurimmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bts.sio.azurimmo.dto.InterventionDTO;
import bts.sio.azurimmo.model.Intervention;
import bts.sio.azurimmo.service.InterventionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/interventions")
@CrossOrigin("*")
@Tag(name = "Intervention", description = "API pour la gestion des interventions")
public class InterventionController {

    @Autowired
    private InterventionService interventionService;

    @PostMapping("/")
    @Operation(summary = "Ajouter une intervention")
    public Intervention createIntervention(@RequestBody Intervention intervention) {
        return interventionService.saveIntervention(intervention);
    }

    @GetMapping("/")
    @Operation(summary = "Lister toutes les interventions")
    public List<InterventionDTO> getAllInterventions() {
        return interventionService.getAllInterventions();
    }
}