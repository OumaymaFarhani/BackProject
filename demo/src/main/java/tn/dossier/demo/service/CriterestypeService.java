package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Cahierchargestype;
import tn.dossier.demo.entity.Criterestype;
import tn.dossier.demo.repository.CriterestypeRepository;

@Service
public class CriterestypeService {
	@Autowired
	private CriterestypeRepository criterestypeRepository ;
	

	public List<Criterestype> getAll(){
		return criterestypeRepository.findAll();
	}
	
	
	 

}
