package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniques;
import tn.dossier.demo.entity.CriterescahierclausesfinancierestechniquesId;
import tn.dossier.demo.service.CriterescahierclausesfinancierestechniquesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/criterescahierclausesfinancierestechniques")
public class CriterescahierclausesfinancierestechniquesController {
	
	@Autowired
	private CriterescahierclausesfinancierestechniquesService criterescahierclausesfinancierestechniquesservice;
	
/*
	@GetMapping("/affichercriterefinanacieretype/{id}")
	public  Criterescahierclausesfinancierestechniquestype findOne(@PathVariable Long id ) {
		
	        return criterescahierclausesfinancierestechniquestypeservice.getCriterescahierclausesfinancierestechniquestype(id);
	}
	
	*/

	
	@GetMapping("/afficherCritere")
	public List<Criterescahierclausesfinancierestechniques> getAll(){
		List<Criterescahierclausesfinancierestechniques> na =criterescahierclausesfinancierestechniquesservice.retreiveAllCriterescahierclausesfinancierestechniques();
		return na;
	}
	
	@GetMapping("/afficherOne/{id}")
	public Criterescahierclausesfinancierestechniques getOne(@PathVariable CriterescahierclausesfinancierestechniquesId id){
		
		return criterescahierclausesfinancierestechniquesservice.getCriterescahierclausesfinancierestechniques(id);
	}

	@GetMapping("/affichercriteres/{id}")
	public List<Criterescahierclausesfinancierestechniques> getAll(@PathVariable long id){
			return criterescahierclausesfinancierestechniquesservice.retreiveAll(id);
	}
	
	@PostMapping("/ajoutercriterescahierclausesfinancierestechniques")
	 public void addd(@RequestBody Criterescahierclausesfinancierestechniques c)
	 {
		criterescahierclausesfinancierestechniquesservice.saveCritereFinanciere(c);
	 }
}
