package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.repository.naturecritereRepository;

@Service
public class naturecritereService {

	@Autowired
	private naturecritereRepository nature;
	
	
	//getAll
	public List<Naturecritere> retrieveAllnaturecritere() {
		// TODO Auto-generated method stub
		return (List<Naturecritere>)nature.findAll();
	}
	
	//getOne
	public Naturecritere  getnaturecritere (int id) {
		return nature.findById(id).get();
		
	}

	
	//Ajouter
	public Naturecritere addnaturecritere(Naturecritere n) {
		// TODO Auto-generated method stub
		nature.save(n);
		return n;
	}
	
	//Modifier
	public Naturecritere updatenaturecritere(Naturecritere n1) {
		this.nature.save(n1);
		return(n1);
	}
	
	//Supprimer
	public void deletenaturecritere(int id) {
		// TODO Auto-generated method stub
		nature.deleteById(id);
	}
}
