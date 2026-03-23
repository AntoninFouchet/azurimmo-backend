package bts.sio.azurimmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.Prestataire;

@Repository
public interface PrestataireRepository extends JpaRepository<Prestataire, Long> {
}