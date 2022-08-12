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
import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.service.categoriesprojetService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/categoriesprojet")
public class categoriesprojetController {
	
	@Autowired
	private categoriesprojetService categories;
	
	
	@GetMapping("/affichercategoriesprojet")
	public List<Categoriesprojet> getAll(){
		List<Categoriesprojet> na =categories.retrieveAllcategoriesprojet();
		return na;
	}

	
	@PostMapping("/ajoutercategoriesprojet")
	public Categoriesprojet addcategoriesprojet(@RequestBody Categoriesprojet c1) {
		return categories.addcategoriesprojet( c1);
	}
	

	@GetMapping("/affichercategoriesprojet/{id}")
	public Categoriesprojet getOne(@PathVariable int id){
		
		return categories.getcategoriesprojet(id);
	}
	
	

	@PutMapping("/modifiercategoriesprojet")
	@ResponseBody
	public Categoriesprojet updatecategoriesprojet(@RequestBody Categoriesprojet c2) {
		System.out.println(c2);
		return this.categories.updatecategoriesprojet(c2);
	}
	
	
	@DeleteMapping("/supprimercategoriesprojet/{id}")
	public void deletecategoriesprojet(@PathVariable int id) {
		
		categories.deletecategoriesprojet(id);
		
		
	}
}
