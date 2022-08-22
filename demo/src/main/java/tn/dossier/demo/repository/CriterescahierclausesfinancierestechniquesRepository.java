package tn.dossier.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniques;
import tn.dossier.demo.entity.CriterescahierclausesfinancierestechniquesId;

@Repository
public interface CriterescahierclausesfinancierestechniquesRepository  extends JpaRepository<Criterescahierclausesfinancierestechniques, CriterescahierclausesfinancierestechniquesId>{

	//List<Criterescahierclausesfinancierestechniques> findByCriterescahierclausesfinancierestechniquesCahierClausesFinancieresTechniquesId(Long id);



	List<Criterescahierclausesfinancierestechniques>  findByCahierclausesfinancierestechniquesCahierClausesFinancieresTechniquesId(Long id);

}
