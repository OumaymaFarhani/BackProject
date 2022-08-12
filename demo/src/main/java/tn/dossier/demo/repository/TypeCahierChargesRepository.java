package tn.dossier.demo.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Typecahiercharges;

@Repository
public interface TypeCahierChargesRepository  extends JpaRepository<Typecahiercharges, Integer> {
	 
}
