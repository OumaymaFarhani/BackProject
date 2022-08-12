package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.service.CritereService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/critere")
public class CritereController {
	@Autowired
	private CritereService critereService;
	
	
	@GetMapping("/affichercriteres")
	public List<Criteres> getAll(){
		List<Criteres> listeCritere =critereService.retrieveAllcriteres();
		return listeCritere;
	}
	
	

	@GetMapping("/affichercriteres/{id}")
	public Criteres getOne(@PathVariable long id){
		
		return critereService.getCriteres(id);
	}

}
