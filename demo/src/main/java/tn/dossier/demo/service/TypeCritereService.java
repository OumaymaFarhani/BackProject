package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.TypeCritere;
import tn.dossier.demo.repository.TypeCritereRepository;

@Service
public class TypeCritereService {
	@Autowired
	private TypeCritereRepository typecritererepo;
	
	
	//getAll
		public List<TypeCritere> retrieveAllTypeCritere() {
			// TODO Auto-generated method stub
			return (List<TypeCritere>)typecritererepo.findAll();
		}

		
		

		//getOnecategoriesprojet
		public TypeCritere  getTypeCritere (long id) {
			return typecritererepo.findById(id).get();
			
		}

		
	 
		public TypeCritere addTypeCritere(TypeCritere c) {
			// TODO Auto-generated method stub
			typecritererepo.save(c);
			return c;
		}
		
 
		public TypeCritere updateTypeCritere(TypeCritere cc) {
			this.typecritererepo.save(cc);
			return(cc);
		}
		
		 
		public void deleteTypeCritere(long id) {
			// TODO Auto-generated method stub
			typecritererepo.deleteById(id);
		}

}
