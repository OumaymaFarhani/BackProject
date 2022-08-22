package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.CahierCharges;
import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Criterescahierclausesadministratives;
import tn.dossier.demo.service.CahierclausesadministrativesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cahierclausesadministratives")
public class CahierclausesadministrativesController {

	 @Autowired
	 private CahierclausesadministrativesService cahierclausesadministratives;
	 
	 @GetMapping("/affichertoutcahierclauseadministartive")
		public List<Cahierclausesadministratives> getAll(){
			List<Cahierclausesadministratives> na =cahierclausesadministratives.retrieveAllcahierclausesadministratives();
			return na;
		}
	 
	 @GetMapping("/{id}")
		public Cahierclausesadministratives getOne(@PathVariable long id ){
			return cahierclausesadministratives.getCahierclausesadministratives(id);
		}
	 
	 
	 @GetMapping("/a/{id}")
		public List<Cahierclausesadministratives> getAlls(@PathVariable long id ){
			return cahierclausesadministratives.retrieveAllcahierclausesadministrativesByCahierCharge(id);
		}
	 
	 
	 @GetMapping("/cc/{id}")
		public List<Object> getA(@PathVariable long id ){
			return cahierclausesadministratives.retrieve(id);
		}
	 
	 
	 @GetMapping("/clause/{id}")
		public Object getClause(@PathVariable long id ){
			return cahierclausesadministratives.getclause(id);
		}

		@DeleteMapping("/supprimerclauseAdmin/{id}")
		public void deleteclauseadmin(@PathVariable long id) {
			
			cahierclausesadministratives.deleteClause(id);
			
			
		}
	
	 
}
