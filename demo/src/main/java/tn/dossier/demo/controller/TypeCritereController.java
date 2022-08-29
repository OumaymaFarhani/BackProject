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

import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.TypeCritere;
import tn.dossier.demo.service.TypeCritereService;
import tn.dossier.demo.service.categoriesprojetService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/typeCritere")
public class TypeCritereController {
	@Autowired
	private TypeCritereService typecritereService;
	
	
	@GetMapping("/affichertypeCritere")
	public List<TypeCritere> getAll(){
		List<TypeCritere> na =typecritereService.retrieveAllTypeCritere();
		return na;
	}

	
	@PostMapping("/ajoutertypeCritere")
	public TypeCritere addtypecritere(@RequestBody TypeCritere c1) {
		return typecritereService.addTypeCritere( c1);
	}
	

	@GetMapping("/affichertypeCritere/{id}")
	public TypeCritere getOne(@PathVariable long id){
		
		return typecritereService.getTypeCritere(id);
	}
	
	

	@PutMapping("/modifiertypeCritere")
	@ResponseBody
	public TypeCritere updatetypecritere(@RequestBody TypeCritere c2) {
		System.out.println(c2);
		return this.typecritereService.updateTypeCritere(c2);
	}
	
	
	@DeleteMapping("/supprimertypeCritere/{id}")
	public void deletetypecritere(@PathVariable long id) {
		
		typecritereService.deleteTypeCritere(id);
		
		
	}

}
