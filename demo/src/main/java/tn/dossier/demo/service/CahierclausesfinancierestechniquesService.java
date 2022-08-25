package tn.dossier.demo.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;
import tn.dossier.demo.entity.Typecahiercharges;
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
	
	public Cahierclausesfinancierestechniques  getCahierclausesfinancierestechniques (long id) {
		return cahierclausesfinancierestechniques.findById(id).get();
		
	}

	//SupprimerClauseAdministrative
	public void deleteClause(long id) {
		// TODO Auto-generated method stub
		cahierclausesfinancierestechniques.deleteById(id);
	}
	
	public void ajoutClause(Cahierclausesfinancierestechniques ahierclausesfinancierestechniques ) {
	 
	Typecahiercharges type = new Typecahiercharges();
	type.setTypeCahierChargesId(ahierclausesfinancierestechniques.getTypecahiercharges().getTypeCahierChargesId());
		type.setTypeCahierChargesLibelle(ahierclausesfinancierestechniques.getTypecahiercharges().getTypeCahierChargesLibelle());
		
	 
			//insertion dans table financiere
		
		//cahierclausesadministrative.setCahierClausesAdministrativesId(cahierClauseModel.getCahierClausesAdministrativesId());
		ahierclausesfinancierestechniques.setCahierDesClauseFinancierTechnqueLibelle(ahierclausesfinancierestechniques.getCahierDesClauseFinancierTechnqueLibelle());
		ahierclausesfinancierestechniques.setCahiercharges(ahierclausesfinancierestechniques.getCahiercharges());
		ahierclausesfinancierestechniques.setCahierClausesFinancieresTechniquesDescription(ahierclausesfinancierestechniques.getCahierClausesFinancieresTechniquesDescription());
		ahierclausesfinancierestechniques.setCategoriesprojet(ahierclausesfinancierestechniques.getCategoriesprojet());
		
		ahierclausesfinancierestechniques.setTypecahiercharges(type);
		
		cahierclausesfinancierestechniques.save(ahierclausesfinancierestechniques );	
	}
}
