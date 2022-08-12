package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Intervalles;

@Repository
public interface IntervallesRepository extends JpaRepository<Intervalles, Long>{

}
