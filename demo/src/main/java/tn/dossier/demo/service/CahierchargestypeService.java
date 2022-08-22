package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierchargestype;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.repository.CahierchargestypeRepository;
import tn.dossier.demo.repository.TypeCahierChargesRepository;

@Service
public class CahierchargestypeService {
	
	@Autowired
	private CahierchargestypeRepository cahierchargetypeRepo;
	
	
	public List<Cahierchargestype> getAll(){
		return cahierchargetypeRepo.findAll();
	}
	
	
	public Cahierchargestype getone(long id){
		return cahierchargetypeRepo.getById(id);
	}
	
	
	//Ajouter
	public Cahierchargestype addCahierchargestype(Cahierchargestype cahierchargetype) {
		// TODO Auto-generated method stub
		cahierchargetypeRepo.save(cahierchargetype);
		return cahierchargetype;
	}
	
	//Modifier
	public Cahierchargestype updateCahierchargestype(Cahierchargestype cahierchargetype) {
		this.cahierchargetypeRepo.save(cahierchargetype);
		return(cahierchargetype);
	}
	
	//Supprimer
	public void deleteCahierchargestype(long id) {
		// TODO Auto-generated method stub
		cahierchargetypeRepo.deleteById(id);
	}

}
