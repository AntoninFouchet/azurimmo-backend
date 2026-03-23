package bts.sio.azurimmo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bts.sio.azurimmo.dto.TypeInterventionDTO;
import bts.sio.azurimmo.model.TypeIntervention;
import bts.sio.azurimmo.service.TypeInterventionService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/type-interventions")
@CrossOrigin("*")
@Tag(name = "Type Intervention", description = "API pour la gestion des types d'interventions")
public class TypeInterventionController {

    @Autowired
    private TypeInterventionService typeInterventionService;

    @PostMapping("/")
    @Operation(summary = "Ajouter un type d'intervention")
    public TypeIntervention createTypeIntervention(@RequestBody TypeIntervention typeIntervention) {
        return typeInterventionService.saveTypeIntervention(typeIntervention);
    }

    @GetMapping("/")
    @Operation(summary = "Lister tous les types d'interventions")
    public List<TypeInterventionDTO> getAllTypeInterventions() {
        return typeInterventionService.getAllTypeInterventions();
    }
}