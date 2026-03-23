package bts.sio.azurimmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.Gerant;

@Repository
public interface GerantRepository extends JpaRepository<Gerant, Long> {
}