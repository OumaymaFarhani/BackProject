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

import tn.dossier.demo.entity.Cahierchargestype;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.service.CahierchargestypeService;
import tn.dossier.demo.service.TypeCahierChargesService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cahierchargestype")
public class CahierchargestypeController {
	
	@Autowired
	private CahierchargestypeService cahierchargeservice;
	
	@GetMapping("/afficher")
	public List<Cahierchargestype> getAll(){
		List<Cahierchargestype> na =cahierchargeservice.getAll();
		return na;
	}
	
	@GetMapping("/afficher/{id}")
	public Cahierchargestype getOne(@PathVariable long id){
		
		return cahierchargeservice.getone(id);
	}
	
	@PostMapping("/ajouter")
	public Cahierchargestype addCahierchargestype(@RequestBody Cahierchargestype n1) {
		return cahierchargeservice.addCahierchargestype(n1);
	}
	
	@PutMapping("/modifier")
	@ResponseBody
	public Cahierchargestype updateCahierchargestype(@RequestBody Cahierchargestype i) {
		System.out.println(i);
		return this.cahierchargeservice.updateCahierchargestype(i);
	}
	
	
	@DeleteMapping("/supprimer/{id}")
	public void deleteCahierchargestype(@PathVariable long id) {
		
		cahierchargeservice.deleteCahierchargestype(id);
		
		
	}
	

}
