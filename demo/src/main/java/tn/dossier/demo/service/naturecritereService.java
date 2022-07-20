package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.naturecritere;
import tn.dossier.demo.repository.naturecritereRepository;

@Service
public class naturecritereService {

	@Autowired
	private naturecritereRepository nature;
	
	
	//getAll
	public List<naturecritere> retrieveAllnaturecritere() {
		// TODO Auto-generated method stub
		return (List<naturecritere>)nature.findAll();
	}
	
	//getOne
	public naturecritere  getnaturecritere (int id) {
		return nature.findById(id).get();
		
	}

	
	//Ajouter
	public naturecritere addnaturecritere(naturecritere n) {
		// TODO Auto-generated method stub
		nature.save(n);
		return n;
	}
	
	//Modifier
	public naturecritere updatenaturecritere(naturecritere n1) {
		this.nature.save(n1);
		return(n1);
	}
	
	//Supprimer
	public void deletenaturecritere(int id) {
		// TODO Auto-generated method stub
		nature.deleteById(id);
	}
}
