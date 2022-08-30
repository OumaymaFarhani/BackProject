package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.CriterescahierclausesadministrativesId;
import tn.dossier.demo.repository.CahierclausesadministrativesRepository;
import tn.dossier.demo.repository.CritereRepository;
import tn.dossier.demo.repository.CriterescahierclausesadministrativesRepository;
import tn.dossier.demo.repository.CriterescahierclausesfinancierestechniquestypeRepository;

@Service
public class CriterescahierclausesadministrativesService {
	@Autowired
	private CriterescahierclausesadministrativesRepository criterescahierclausesadminRepository;
	@Autowired
	private CritereRepository critereRepository;
	@Autowired
	private CahierclausesadministrativesRepository cahierclausesadministratives;
	
	
	
	public List<Criterescahierclausesadministratives> retrieveAll(long id){
		return criterescahierclausesadminRepository.findByCahierclausesadministrativesCahierClausesAdministrativesId(id);
	}
	
	public Criterescahierclausesadministratives retrieveOne(CriterescahierclausesadministrativesId id){
		return criterescahierclausesadminRepository.findById(id).get();
	}
public void ajoutcritere(Criterescahierclausesadministratives c) {
	criterescahierclausesadminRepository.save(c);
}

//ajouter un critere administrative
public void saveCritereAdmin(Criterescahierclausesadministratives criterescahierclausesadministratives) {
	 Criteres critere=new Criteres();
	 Cahierclausesadministratives cahierclausesadministratives =new Cahierclausesadministratives();
	CriterescahierclausesadministrativesId criterescahierclausesadministrativesId=new CriterescahierclausesadministrativesId();
	criterescahierclausesadministrativesId.setCahierClausesAdministrativesId(criterescahierclausesadministratives.getId().getCahierClausesAdministrativesId());
	criterescahierclausesadministrativesId.setCriteresId(criterescahierclausesadministratives.getId().getCriteresId());
	criterescahierclausesadministratives.setId(criterescahierclausesadministrativesId);
	criterescahierclausesadministratives.setCriteres(criterescahierclausesadministratives.getCriteres());
	criterescahierclausesadminRepository.save(criterescahierclausesadministratives);
}


//modifier un critere administrative
public void updateCritereAdmin(Criterescahierclausesadministratives criterescahierclausesadministratives) {
	 Criteres critere=new Criteres();
	 Cahierclausesadministratives cahierclausesadministratives =new Cahierclausesadministratives();
	CriterescahierclausesadministrativesId criterescahierclausesadministrativesId=new CriterescahierclausesadministrativesId();
	criterescahierclausesadministrativesId.setCahierClausesAdministrativesId(criterescahierclausesadministratives.getId().getCahierClausesAdministrativesId());
	criterescahierclausesadministrativesId.setCriteresId(criterescahierclausesadministratives.getId().getCriteresId());
	criterescahierclausesadministratives.setId(criterescahierclausesadministrativesId);
	criterescahierclausesadministratives.setCriteres(criterescahierclausesadministratives.getCriteres());
	criterescahierclausesadminRepository.save(criterescahierclausesadministratives);
}
}
