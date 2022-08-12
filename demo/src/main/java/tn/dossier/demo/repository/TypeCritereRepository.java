package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.dossier.demo.entity.TypeCritere;

@Repository
public interface TypeCritereRepository extends JpaRepository<TypeCritere, Long> {
 
}
