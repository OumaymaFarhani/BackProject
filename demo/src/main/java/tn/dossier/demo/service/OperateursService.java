package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.entity.Operateurs;
import tn.dossier.demo.repository.OperateursRepository;

@Service
public class OperateursService {
	
	@Autowired
	private OperateursRepository operateursRepository;
	
	public List<Operateurs> retreiveAllOperateurs(){
		return (List<Operateurs>)operateursRepository.findAll();
	}
	
	//getOne
		public Operateurs  getoperateurs (long id) {
			return operateursRepository.findById(id).get();
			
		}

}
