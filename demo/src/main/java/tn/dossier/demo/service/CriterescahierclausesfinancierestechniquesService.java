package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;
import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.CriterescahierclausesadministrativesId;
import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniques;
import tn.dossier.demo.entity.CriterescahierclausesfinancierestechniquesId;
import tn.dossier.demo.repository.CahierclausesfinancierestechniquesRepository;
import tn.dossier.demo.repository.CritereRepository;
import tn.dossier.demo.repository.CriterescahierclausesfinancierestechniquesRepository;

@Service
public class CriterescahierclausesfinancierestechniquesService {
	@Autowired
	private CriterescahierclausesfinancierestechniquesRepository criterescahierclausesfinancierestechniquesRepository;
	@Autowired
	private CritereRepository critereRepository;
	@Autowired
	private CahierclausesfinancierestechniquesRepository cahierclausesfinancierestechniques;

	
	public List<Criterescahierclausesfinancierestechniques> retreiveAllCriterescahierclausesfinancierestechniques(){
		return (List<Criterescahierclausesfinancierestechniques>)criterescahierclausesfinancierestechniquesRepository.findAll();
	}
	
	//getOne
		public Criterescahierclausesfinancierestechniques  getCriterescahierclausesfinancierestechniques (CriterescahierclausesfinancierestechniquesId id) {
			return criterescahierclausesfinancierestechniquesRepository.findById(id).get();
			
		}
		
		
		public List<Criterescahierclausesfinancierestechniques> retreiveAll(Long id){
			return (List<Criterescahierclausesfinancierestechniques>)criterescahierclausesfinancierestechniquesRepository.findByCahierclausesfinancierestechniquesCahierClausesFinancieresTechniquesId(id);
		}
		
		
		

		//ajouter un critere administrative
		public void saveCritereFinanciere(Criterescahierclausesfinancierestechniques criterescahierclausesfinancierestechniques) {
			 Criteres critere=new Criteres();
			 Cahierclausesfinancierestechniques cahierclausesfinancierestechniques =new Cahierclausesfinancierestechniques();
			 CriterescahierclausesfinancierestechniquesId criterescahierclausesfinancierestechniquesId=new CriterescahierclausesfinancierestechniquesId();
			 criterescahierclausesfinancierestechniquesId.setCahierClausesFinancieresTechniquesId(criterescahierclausesfinancierestechniques.getId().getCahierClausesFinancieresTechniquesId());
			 criterescahierclausesfinancierestechniquesId.setCriteresId(criterescahierclausesfinancierestechniques.getId().getCriteresId());
			 criterescahierclausesfinancierestechniques.setId(criterescahierclausesfinancierestechniquesId);
			 criterescahierclausesfinancierestechniques.setCriteres(criterescahierclausesfinancierestechniques.getCriteres());
			 criterescahierclausesfinancierestechniquesRepository.save(criterescahierclausesfinancierestechniques);
		}

}
