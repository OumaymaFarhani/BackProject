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
import tn.dossier.demo.entity.Intervallestype;
import tn.dossier.demo.service.IntervallestypeService;



@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/intervallestype")
public class IntervallestypeController {
	
	@Autowired
	private IntervallestypeService intervallestypeService;
	
	@GetMapping("/afficherintervallestype")
	@ResponseBody
	public List<Intervallestype> findAll(){
		 List<Intervallestype> intervaletype=intervallestypeService.retrieveAllintervallestype();
		 return intervaletype;
	}

	@GetMapping("/afficherintervallestype/{id}")
	public Intervallestype findOne(@PathVariable long id ) {
		return intervallestypeService.getintervallestype(id);
	}
	

	@PostMapping("/ajouterintervallestype")
	public Intervallestype addintervallestype(@RequestBody Intervallestype i) {
		return intervallestypeService.addintervalletype(i);
	}
	

	@PutMapping("/modifierintervallestype")
	@ResponseBody
	public Intervallestype updateintervallestype(@RequestBody Intervallestype i) {
		System.out.println(i);
		return this.intervallestypeService.updateintervallestype(i);
	}
	
	
	@DeleteMapping("/supprimerintervallestype/{id}")
	public void deleteintervallestype(@PathVariable long id) {
		
		intervallestypeService.deleteintervallestype(id);
		
		
	}

}
