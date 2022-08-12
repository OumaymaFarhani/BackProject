package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.Criteres;
import tn.dossier.demo.repository.CritereRepository;

@Service
public class CritereService {
	
	@Autowired
	private CritereRepository critereRepository;
	
	
	//getAll
			public List<Criteres> retrieveAllcriteres() {
				// TODO Auto-generated method stub
				return (List<Criteres>)critereRepository.findAll();
			}
			
			//getOne
			public Criteres  getCriteres (long id) {
				return critereRepository.findById(id).get();
				
			}
			
			//AjouterCriteres
			public Criteres addcritere(Criteres c) {
				// TODO Auto-generated method stub
				critereRepository.save(c);
				return c;
			}
			
			
		

}
