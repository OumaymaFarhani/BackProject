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

import tn.dossier.demo.entity.categoriesprojet;
import tn.dossier.demo.entity.naturecritere;
import tn.dossier.demo.service.categoriesprojetService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/categoriesprojet")
public class categoriesprojetController {
	
	@Autowired
	private categoriesprojetService categories;
	
	
	@GetMapping("/affichercategoriesprojet")
	public List<categoriesprojet> getAll(){
		List<categoriesprojet> na =categories.retrieveAllcategoriesprojet();
		return na;
	}

	
	@PostMapping("/ajoutercategoriesprojet")
	public categoriesprojet addcategoriesprojet(@RequestBody categoriesprojet c1) {
		return categories.addcategoriesprojet( c1);
	}
	

	@GetMapping("/affichercategoriesprojet/{id}")
	public categoriesprojet getOne(@PathVariable int id){
		
		return categories.getcategoriesprojet(id);
	}
	
	

	@PutMapping("/modifiercategoriesprojet")
	@ResponseBody
	public categoriesprojet updatecategoriesprojet(@RequestBody categoriesprojet c2) {
		System.out.println(c2);
		return this.categories.updatecategoriesprojet(c2);
	}
	
	
	@DeleteMapping("/supprimercategoriesprojet/{id}")
	public void deletecategoriesprojet(@PathVariable int id) {
		
		categories.deletecategoriesprojet(id);
		
		
	}
}
