package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.naturecritere;
import tn.dossier.demo.repository.naturecritereRepository;
import tn.dossier.demo.service.naturecritereService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/natureCriter")
public class naturecritereController {
	@Autowired
	private naturecritereService nn;
	
	@PostMapping("/ajouter")
	public naturecritere addnaturecritere(@RequestBody naturecritere n1) {
		return nn.addnaturecritere( n1);
	}
	


	@GetMapping(path="/test")
	public String gettest() {
		return "xtensus";
	}
	
	@GetMapping("/afficher")
	public List<naturecritere> getAll(){
		List<naturecritere> na =nn.retrieveAllnaturecritere();
		return na;
	}
	@GetMapping("/afficherOne/{id}")
	
	public naturecritere getOne(@PathVariable int id){
		
		return nn.getnaturecritere(id);
	}
	

	@PutMapping("/modifiernaturecritere")
	@ResponseBody
	public naturecritere updatenaturecritere(@RequestBody naturecritere n2) {
		System.out.println(n2);
		return this.nn.updatenaturecritere(n2);
	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void deletecritere(@PathVariable int id) {
		
		nn.deletenaturecritere(id);
		
		
	}
}
