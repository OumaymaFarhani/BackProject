package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.categoriesprojet;
import tn.dossier.demo.entity.naturecritere;
import tn.dossier.demo.repository.categoriesprojetRepository;
import tn.dossier.demo.repository.naturecritereRepository;

@Service
public class categoriesprojetService {
	@Autowired
	private categoriesprojetRepository categorie;
	
	
	//getAll
		public List<categoriesprojet> retrieveAllcategoriesprojet() {
			// TODO Auto-generated method stub
			return (List<categoriesprojet>)categorie.findAll();
		}

		
		

		//getOnecategoriesprojet
		public categoriesprojet  getcategoriesprojet (int id) {
			return categorie.findById(id).get();
			
		}

		
		//Ajoutercategoriesprojet
		public categoriesprojet addcategoriesprojet(categoriesprojet c) {
			// TODO Auto-generated method stub
			categorie.save(c);
			return c;
		}
		
		//Modifiercategoriesprojet
		public categoriesprojet updatecategoriesprojet(categoriesprojet cc) {
			this.categorie.save(cc);
			return(cc);
		}
		
		//Supprimercategoriesprojet
		public void deletecategoriesprojet(int id) {
			// TODO Auto-generated method stub
			categorie.deleteById(id);
		}
}
