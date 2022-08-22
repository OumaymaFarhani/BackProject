package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Cahierchargestype;

@Repository
public interface CahierchargestypeRepository extends JpaRepository<Cahierchargestype, Long> {

}
