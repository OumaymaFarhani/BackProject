package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.CriterescahierclausesadministrativesId;
import tn.dossier.demo.entity.TypeCritere;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.repository.CritereRepository;
import tn.dossier.demo.repository.CriterescahierclausesadministrativesRepository;
import tn.dossier.demo.repository.TypeCahierChargesRepository;

@Service
public class CritereService {
	
	@Autowired
	private CritereRepository critereRepository;
	@Autowired
	private CriterescahierclausesadministrativesRepository criterescahierclausesadminRepository;

	@Autowired
	private TypeCahierChargesRepository typeCahierCharges;
	
	
	//getAll
			public List<Criteres> retrieveAllcriteres() {
				// TODO Auto-generated method stub
				return (List<Criteres>)critereRepository.findAll();
			}
			
			//getOne
			public Criteres  getCriteres (long id) {
				return critereRepository.findById(id).get();
				
			}
			
			//AjouterCriteres
			public Criteres addcritere(Criteres c) {
				// TODO Auto-generated method stub
				critereRepository.save(c);
				return c;
			}
			
			
			public List<Criteres> retreiveCriterebyType(){
				TypeCritere t=new TypeCritere();
				return critereRepository.findByTypecritere(t);
			}
			
			
		/*	public void ajout() {
				Criteres critere=new Criteres();
				Typecahiercharges type = new Typecahiercharges();
				
				Cahierclausesadministratives cahierclausesadministratives=new Cahierclausesadministratives();
				Criterescahierclausesadministratives criterescahierclausesadministratives =new Criterescahierclausesadministratives();
				CriterescahierclausesadministrativesId criterescahierclausesadministrativesId=new CriterescahierclausesadministrativesId();
				criterescahierclausesadministrativesId.setCahierClausesAdministrativesId(cahierclausesadministratives.getCahierClausesAdministrativesId());
				criterescahierclausesadministrativesId.setCriteresId(critere.getCriteresId());
				criterescahierclausesadministratives.setId(criterescahierclausesadministrativesId);
				criterescahierclausesadministratives.setCriteres(critere);

				critere.setCriteresElimination(Boolean.valueOf(critere.getCriteresLibelle()).booleanValue());
				
			
				
			}
			
			*/
			
		

}
