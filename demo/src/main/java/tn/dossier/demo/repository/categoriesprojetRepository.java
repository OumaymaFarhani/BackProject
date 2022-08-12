package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Categoriesprojet;

@Repository
public interface categoriesprojetRepository extends JpaRepository<Categoriesprojet, Integer> {

}
