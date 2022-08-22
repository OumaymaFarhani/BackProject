package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Criterestype;

@Repository
public interface CriterestypeRepository extends JpaRepository<Criterestype, Long>{

}
