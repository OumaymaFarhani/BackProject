package tn.dossier.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.dossier.demo.entity.Operateurs;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.service.OperateursService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/operateurs")
public class OperateursController {
	
	@Autowired
	private OperateursService operateursService;
	
	
	@GetMapping("/afficherOperateurs")
	public List<Operateurs> getAll(){
		List<Operateurs> na =operateursService.retreiveAllOperateurs();
		return na;
	}
	
	@GetMapping("/afficherOne/{id}")
	public Operateurs getOne(@PathVariable long id){
		
		return operateursService.getoperateurs(id);
	}
	

}
