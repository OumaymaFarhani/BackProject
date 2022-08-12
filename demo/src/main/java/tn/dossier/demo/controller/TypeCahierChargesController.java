package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.service.TypeCahierChargesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/typeCahierCharges")
public class TypeCahierChargesController {
	@Autowired
	private TypeCahierChargesService tt;
	
	@GetMapping("/afficher")
	public List<Typecahiercharges> getAll(){
		List<Typecahiercharges> na =tt.getAll();
		return na;
	}
	
	@GetMapping("/afficherOne/{id}")
	public Typecahiercharges getOne(@PathVariable int id){
		
		return tt.getone(id);
	}
	

}
