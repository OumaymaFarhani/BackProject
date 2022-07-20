package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.naturecritere;

@Repository
public interface naturecritereRepository extends JpaRepository<naturecritere, Integer>{

}
