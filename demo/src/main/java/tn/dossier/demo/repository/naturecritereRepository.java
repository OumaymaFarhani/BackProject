package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Naturecritere;

@Repository
public interface naturecritereRepository extends JpaRepository<Naturecritere, Integer>{

}
