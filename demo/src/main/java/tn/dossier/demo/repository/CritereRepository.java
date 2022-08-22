package tn.dossier.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.entity.TypeCritere;

@Repository
public interface CritereRepository extends JpaRepository<Criteres, Long> {
	List<Criteres> findByTypecritere(TypeCritere typecritere);

}
