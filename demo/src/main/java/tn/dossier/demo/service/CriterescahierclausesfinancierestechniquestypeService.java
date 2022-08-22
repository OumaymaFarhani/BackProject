package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniquestype;
import tn.dossier.demo.entity.Operateurs;
import tn.dossier.demo.repository.CriterescahierclausesfinancierestechniquestypeRepository;

@Service
public class CriterescahierclausesfinancierestechniquestypeService {
	@Autowired
	private CriterescahierclausesfinancierestechniquestypeRepository criterescahierclausesfinancierestechniquestypeRepository;
	
	
	/*
	
	 public Criterescahierclausesfinancierestechniquestype getCriterescahierclausesfinancierestechniquestype(Long criterfinanId) {
	        return criterescahierclausesfinancierestechniquestypeRepository.findById(criterfinanId).orElseThrow(() ->
	                new IllegalArgumentException("critere with this Id: " + criterfinanId + " could not be found"));
	    }
*/
	
	public List<Criterescahierclausesfinancierestechniquestype> retreiveAllCriterescahierclausesfinancierestechniquestype(){
		return (List<Criterescahierclausesfinancierestechniquestype>)criterescahierclausesfinancierestechniquestypeRepository.findAll();
	}
	
	//getOne
		public Criterescahierclausesfinancierestechniquestype  getCriterescahierclausesfinancierestechniquestype (long id) {
			return criterescahierclausesfinancierestechniquestypeRepository.findById(id).get();
			
		}

}
