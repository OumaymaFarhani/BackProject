package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.entity.Intervallestype;
import tn.dossier.demo.repository.IntervallestypeRepository;

@Service
public class IntervallestypeService {
	@Autowired
	private IntervallestypeRepository intervallestypeRepository;
	
	
	
	//getAll
	public List<Intervallestype> retrieveAllintervallestype() {
		// TODO Auto-generated method stub
		return (List<Intervallestype>)intervallestypeRepository.findAll();
	}

	//getOne
	public Intervallestype  getintervallestype (long id) {
		return intervallestypeRepository.findById(id).get();
		
	}
	
	//AjouterIntervallestype
	public Intervallestype addintervalletype(Intervallestype c) {
		
		intervallestypeRepository.save(c);
		return c;
	}
	
	
	//ModifierIntervallestype
	public Intervallestype updateintervallestype(Intervallestype cc) {
		this.intervallestypeRepository.save(cc);
		return(cc);
	}
	
	//SupprimerIntervallestype
	public void deleteintervallestype(long id) {
		// TODO Auto-generated method stub
		intervallestypeRepository.deleteById(id);
	}
}
