package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.CahierCharges;
import tn.dossier.demo.entity.Cahierclausesadministratives;
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
	 
	 @GetMapping("/a/{id}")
		public List<Cahierclausesadministratives> getAlls(@PathVariable long id ){
			return cahierclausesadministratives.retrieveAllcahierclausesadministrativesByCahierCharge(id);
		}
	 
	 
	 @GetMapping("/cc/{id}")
		public List<Object> getA(@PathVariable long id ){
			return cahierclausesadministratives.retrieve(id);
		}
	 
	 
}