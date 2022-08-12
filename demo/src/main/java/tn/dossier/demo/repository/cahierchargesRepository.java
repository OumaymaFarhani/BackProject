package tn.dossier.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.CahierCharges;
import tn.dossier.demo.entity.Cahierclausesadministratives;
@Repository
public interface cahierchargesRepository extends JpaRepository<CahierCharges, Long> {
	
	
}
