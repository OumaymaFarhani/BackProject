package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Intervalles;
import tn.dossier.demo.repository.IntervallesRepository;

@Service
public class IntervallesService {
	
	@Autowired
	private IntervallesRepository intervallesRepository ;
	
	

	//getAll
	public List<Intervalles> retrieveAllintervalles() {
	 
		return (List<Intervalles>)intervallesRepository.findAll();
	}

	//getOne
	public Intervalles  getintervalles (long id) {
		return intervallesRepository.findById(id).get();
		
	}
	
	//AjouterIntervalles 
	public Intervalles addintervalle(Intervalles  c) {
		
		intervallesRepository.save(c);
		return c;
	}
	
	
	//ModifierIntervalles 
	public Intervalles updateintervalles(Intervalles cc) {
		this.intervallesRepository.save(cc);
		return(cc);
	}
	
	//SupprimerIntervalles 
	public void deleteintervalles(long id) {
		// TODO Auto-generated method stub
		intervallesRepository.deleteById(id);
	}

}
