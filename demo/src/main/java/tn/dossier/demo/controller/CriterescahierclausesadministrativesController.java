package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.entity.CriterescahierclausesadministrativesId;
import tn.dossier.demo.service.CritereService;
import tn.dossier.demo.service.CriterescahierclausesadministrativesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/critereadministartive")
public class CriterescahierclausesadministrativesController {
	
	@Autowired
	private CriterescahierclausesadministrativesService s;
	
	
	@GetMapping("/affichercriteres/{id}")
	public List<Criterescahierclausesadministratives> getAll(@PathVariable long id){
		List<Criterescahierclausesadministratives> listeCritere =s.retrieveAll(id);
		return listeCritere;
	}
	

	@GetMapping("/affichercriteresbyid/{id2}/{id1}")
	public Criterescahierclausesadministratives getOne(@PathVariable long id2,@PathVariable long id1){
		CriterescahierclausesadministrativesId id = new CriterescahierclausesadministrativesId(id2, id1);
		return s.retrieveOne(id);
	}
	
	@PostMapping("/ajouter")
	 public void add(@RequestBody Criterescahierclausesadministratives c)
	 {
		 s.ajoutcritere(c);
	 }
	
	
	
	
	@PostMapping("/ajoutercritereadministartive")
	 public void addd(@RequestBody Criterescahierclausesadministratives c)
	 {
		 s.saveCritereAdmin(c);
	 }
	

	@PutMapping("/modifiercritereadministartive")
	@ResponseBody
	 public void update(@RequestBody Criterescahierclausesadministratives c)
	 {
		 s.updateCritereAdmin(c);
	 }

}
