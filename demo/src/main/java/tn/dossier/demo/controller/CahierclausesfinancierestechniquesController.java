package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;
import tn.dossier.demo.service.CahierclausesfinancierestechniquesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cahierclausesfinancierestechniques")
public class CahierclausesfinancierestechniquesController {
	
	@Autowired
	private CahierclausesfinancierestechniquesService cahierclausesfinancierestechniques;
	
	 @GetMapping("/affichertoutcahierclausesfinancierestechniques")
		public List<Cahierclausesfinancierestechniques> getAll(){
			List<Cahierclausesfinancierestechniques> na =cahierclausesfinancierestechniques.retrieveAllCahierclausesfinancierestechniques();
			return na;
		}

	 @GetMapping("/cahiercharge/{id}")
		public List<Cahierclausesfinancierestechniques> getAlls(@PathVariable long id ){
			return cahierclausesfinancierestechniques.retrieveAllcahierclausesfinancierestechniquesByCahierCharge(id);
		}
}