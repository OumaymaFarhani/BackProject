package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.repository.categoriesprojetRepository;
import tn.dossier.demo.repository.naturecritereRepository;

@Service
public class categoriesprojetService {
	@Autowired
	private categoriesprojetRepository categorie;
	
	
	//getAll
		public List<Categoriesprojet> retrieveAllcategoriesprojet() {
			// TODO Auto-generated method stub
			return (List<Categoriesprojet>)categorie.findAll();
		}

		
		

		//getOnecategoriesprojet
		public Categoriesprojet  getcategoriesprojet (int id) {
			return categorie.findById(id).get();
			
		}

		
		//Ajoutercategoriesprojet
		public Categoriesprojet addcategoriesprojet(Categoriesprojet c) {
			// TODO Auto-generated method stub
			categorie.save(c);
			return c;
		}
		
		//Modifiercategoriesprojet
		public Categoriesprojet updatecategoriesprojet(Categoriesprojet cc) {
			this.categorie.save(cc);
			return(cc);
		}
		
		//Supprimercategoriesprojet
		public void deletecategoriesprojet(int id) {
			// TODO Auto-generated method stub
			categorie.deleteById(id);
		}
}
