package tn.dossier.demo.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.CahierCharges;
import tn.dossier.demo.entity.Cahierclausesadministratives;

@Repository
public interface CahierclausesadministrativesRepository extends JpaRepository<Cahierclausesadministratives, Long> {

	List<Cahierclausesadministratives> findByCahierchargesCahierChargesId(Long id) ;
	
}
