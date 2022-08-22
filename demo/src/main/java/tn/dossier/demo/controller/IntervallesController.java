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

import tn.dossier.demo.entity.Intervalles;
import tn.dossier.demo.service.IntervallesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/intervalles")
public class IntervallesController {
	

	@Autowired
	private IntervallesService intervallesService;
	
	@GetMapping("/afficherintervalles")
	@ResponseBody
	public List<Intervalles> findAll(){
		
		 List<Intervalles> intervale=intervallesService.retrieveAllintervalles();
		 return intervale;
	}

	@GetMapping("/afficherintervalles/{id}")
	public Intervalles findOne(@PathVariable long id ) {
		return intervallesService.getintervalles(id);
	}
	

	@PostMapping("/ajouterintervalles")
	public Intervalles addintervalles(@RequestBody Intervalles i) {
		System.out.println(i);
		return intervallesService.addintervalle(i);
	}
	

	@PutMapping("/modifierintervalles")
	@ResponseBody
	public Intervalles updateintervalles(@RequestBody Intervalles i) {
		System.out.println(i);
		return this.intervallesService.updateintervalles(i);
	}
	
	
	@DeleteMapping("/supprimerintervalles/{id}")
	public void deleteintervalles(@PathVariable long id) {
		
		intervallesService.deleteintervalles(id);
		
		
	}


}
