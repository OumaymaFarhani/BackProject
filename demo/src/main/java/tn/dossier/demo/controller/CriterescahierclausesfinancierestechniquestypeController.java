package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniques;
import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniquestype;
import tn.dossier.demo.entity.Intervalles;
import tn.dossier.demo.entity.Operateurs;
import tn.dossier.demo.service.CriterescahierclausesfinancierestechniquestypeService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/criterescahierclausesfinancierestechniquestype")
public class CriterescahierclausesfinancierestechniquestypeController {
	@Autowired
	private CriterescahierclausesfinancierestechniquestypeService criterescahierclausesfinancierestechniquestypeservice;
	
/*
	@GetMapping("/affichercriterefinanacieretype/{id}")
	public  Criterescahierclausesfinancierestechniquestype findOne(@PathVariable Long id ) {
		
	        return criterescahierclausesfinancierestechniquestypeservice.getCriterescahierclausesfinancierestechniquestype(id);
	}
	
	*/

	
	@GetMapping("/afficherCriteretype")
	public List<Criterescahierclausesfinancierestechniquestype> getAll(){
		List<Criterescahierclausesfinancierestechniquestype> na =criterescahierclausesfinancierestechniquestypeservice.retreiveAllCriterescahierclausesfinancierestechniquestype();
		return na;
	}
	
	@GetMapping("/afficherOne/{id}")
	public Criterescahierclausesfinancierestechniquestype getOne(@PathVariable long id){
		
		return criterescahierclausesfinancierestechniquestypeservice.getCriterescahierclausesfinancierestechniquestype(id);
	}
}
