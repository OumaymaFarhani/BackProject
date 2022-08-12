package tn.dossier.demo.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;

@Repository
public interface CahierclausesfinancierestechniquesRepository extends JpaRepository<Cahierclausesfinancierestechniques, Long>{
	List<Cahierclausesfinancierestechniques> findByCahierchargesCahierChargesId(Long id) ;

}
