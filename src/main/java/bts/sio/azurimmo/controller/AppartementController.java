package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.service.AppartementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import bts.sio.azurimmo.dto.AppartementDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appartements")
@CrossOrigin("*")
@Tag(name = "Appartement", description = "API pour la gestion des appartements")
public class AppartementController {
	
   @Autowired
    private AppartementService appartementService;

	
    @PostMapping("/")
    @Operation(summary = "Ajouter un appartement")
    public AppartementDTO createAppartement(@RequestBody AppartementDTO appartementDTO) {
        return appartementService.saveAppartementDTO(appartementDTO);
    }
    
    @GetMapping("/ville/{ville}")
    @Operation(summary = "Lister tous les appartements d'une ville")
    public List<AppartementDTO> findByVille(@PathVariable String ville) {
        return appartementService.findByVille(ville);
    }
    
    @GetMapping("/batiment/{batimentId}")
    @Operation(summary = "Lister tous les appartements d'un batiment")
    public List<AppartementDTO> getAppartementsParBatiment(@PathVariable long batimentId) {
            return appartementService.getAppartementsParBatiment(batimentId);
     }
    
    @GetMapping("/surfaceGreaterThan/{surface}")
    @Operation(summary = "Lister tous les appartements ayant une certaine surface")
    public List<AppartementDTO> findAppartementsBySurfaceGreaterThan(@PathVariable float surface) {
        return appartementService.findAppartementsBySurfaceGreaterThan(surface);
    }

    @GetMapping("/all")
    @Operation(summary = "Lister tous les appartements")
    public List<AppartementDTO> getAllAppartements() {
        return appartementService.getAllAppartements();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Consulter un appartement via son ID")
    public AppartementDTO getAppartementById(@PathVariable Long id) {
        return appartementService.getAppartementById(id);
    }

}
