package tn.dossier.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.dossier.demo.entity.Operateurs;
@Repository
public interface OperateursRepository extends JpaRepository<Operateurs, Long> {

}
