package tn.dossier.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.CriterescahierclausesadministrativesId;

@Repository
public interface CriterescahierclausesadministrativesRepository extends JpaRepository<Criterescahierclausesadministratives, CriterescahierclausesadministrativesId>{

	List<Criterescahierclausesadministratives> findByCahierclausesadministrativesCahierClausesAdministrativesId(Long id);
	
	

}
