package tn.dossier.demo.controller;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.servlet.annotation.MultipartConfig;

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

import tn.dossier.demo.entity.CahierCharges;
import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.model.CahierClauseModel;
import tn.dossier.demo.service.CahierclausesadministrativesService;
import tn.dossier.demo.service.CahierclausesfinancierestechniquesService;
import tn.dossier.demo.service.cahierchargesService;
import tn.dossier.demo.service.categoriesprojetService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/cahiercharges")
public class cahierchargesController {
	
	@Autowired
	private cahierchargesService cc;
	 @Autowired
	 private CahierclausesadministrativesService cahierclausesadministratives;
	 @Autowired
		private CahierclausesfinancierestechniquesService cahierclausesfinancierestechniques;
		
	
	@GetMapping("/affichercahiercharges")
	public List<CahierCharges> getAll(){
		List<CahierCharges> na =cc.retrieveAllcahiercharges();
		return na;
	}
	
	@GetMapping("/affichercahiercharges/{id}")
	public CahierCharges getOne(@PathVariable int id){
		return cc.getcahiercharges(id);
	}
	
	

	@PostMapping("/ajoutercahiercharges")
	public CahierCharges addcahiercharges(@RequestBody CahierCharges c1) {
		return cc.addcahiercharges(c1);
	}

	


	@PostMapping("/ajouterrcahiercharges/{idD}")
	public CahierCharges ajoutercahiercharges(@RequestBody CahierCharges c1,@PathVariable  int idD) {
		return cc.ajoutercahiercharges(c1,idD);
	}
	
	
	
	
	@PutMapping("/modifiercahiercharges")
	@ResponseBody
	public CahierCharges updatecahiercharges(@RequestBody CahierCharges c2) {
		System.out.println(c2);
		return this.cc.updatecahiercharges(c2);
	}
	
	
	@DeleteMapping("/supprimercahiercharges/{id}")
	public void deleteccahiercharges(@PathVariable int id) {
		
		cc.deletecahiercharges(id);
		
		
	}
	
	
	

	@PostMapping("/ajouterclause/{idCahier}/{idType}/{idCategorie}")
	@ResponseBody
	
	public void addclause(@RequestBody(required=false) Cahierclausesfinancierestechniques  c3,@RequestBody (required=false) Cahierclausesadministratives  c1,@PathVariable Long idCahier,@PathVariable int idType,@PathVariable int idCategorie) {
		System.out.println(c1);
		cc.ajouterClause(c3, c1, idCahier, idType, idCategorie);
	}

	
/*
	@PostMapping("/ajouterclause1/{idCahier}/{idType}/{idCategorie}")
	@ResponseBody
	
	public String  addclause1(@RequestBody Cahierclausesadministratives  c1,@PathVariable Long idCahier,@PathVariable int idType,@PathVariable int idCategorie) {
		System.out.println(c1);
		return cc.ajoutClause( c1, idCahier, idType, idCategorie);
	}
*/
	
	@PostMapping("/ajouterclause")
	@ResponseBody
	
	public void  addclause1(@RequestBody CahierClauseModel CahierClauseModel) {
	
		 cc.ajoutClause( CahierClauseModel);
	}
	

	@PostMapping("/ajouterclause2/{idCahier}/{idType}/{idCategorie}")
	@ResponseBody
	
	public String addclause2(@RequestBody Cahierclausesfinancierestechniques  c3,@PathVariable Long idCahier,@PathVariable int idType,@PathVariable int idCategorie) {
		System.out.println(c3);
		return cc.a1(c3,idCahier, idType, idCategorie);
	}
	
	
	@GetMapping("/affichercahierchargesclause/{id}")
	@ResponseBody
	public List<Typecahiercharges> getOne(@PathVariable long id){
		System.out.println("message");
		return cc.removeTypes(id);
	}

}
