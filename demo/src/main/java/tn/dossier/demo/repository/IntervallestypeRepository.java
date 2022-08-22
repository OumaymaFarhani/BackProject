package tn.dossier.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Intervallestype;

@Repository
public interface IntervallestypeRepository extends JpaRepository<Intervallestype , Long>{

	 List<Intervallestype> findByIntervallesId(Long intervallesId);
	}
