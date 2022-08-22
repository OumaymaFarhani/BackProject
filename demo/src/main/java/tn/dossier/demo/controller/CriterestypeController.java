package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Criterestype;
import tn.dossier.demo.service.CritereService;
import tn.dossier.demo.service.CriterestypeService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/criteretype")
public class CriterestypeController {
	@Autowired
	private CriterestypeService criteretypeService;
	
	
	@GetMapping("/affichercriterestype")
	public List<Criterestype> getAll(){
		List<Criterestype> listeCritere =criteretypeService.getAll();
		return listeCritere;
	}
	

}
