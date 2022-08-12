package tn.dossier.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;
import tn.dossier.demo.repository.CahierclausesfinancierestechniquesRepository;
import tn.dossier.demo.repository.cahierchargesRepository;

@Service
public class CahierclausesfinancierestechniquesService {
	@Autowired
	private CahierclausesfinancierestechniquesRepository cahierclausesfinancierestechniques;
	@Autowired
	private cahierchargesRepository cahiercharges;
	
	
	//getAll
	public List<Cahierclausesfinancierestechniques> retrieveAllCahierclausesfinancierestechniques() {
		// TODO Auto-generated method stub
		return (List<Cahierclausesfinancierestechniques>)cahierclausesfinancierestechniques.findAll();
	}
	public List<Cahierclausesfinancierestechniques> retrieveAllcahierclausesfinancierestechniquesByCahierCharge(Long id) {
		// TODO Auto-generated method stub
		return  cahierclausesfinancierestechniques.findByCahierchargesCahierChargesId(id);
	}
}
