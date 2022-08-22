package tn.dossier.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.entity.Naturecritere;
import tn.dossier.demo.entity.TypeCritere;
import tn.dossier.demo.repository.TypeCahierChargesRepository;
import tn.dossier.demo.repository.TypeCritereRepository;

@Service
public class TypeCahierChargesService {
	
	@Autowired
	private TypeCahierChargesRepository typeCahierCharges;
	@Autowired
	TypeCritereRepository typeCritere;
	/*
	public List<TypeCahierCharges> ajouter(TypeCahierCharges t,Long typeCahierChargeIdType) {
		
		TypeCritere t1=new  TypeCritere();
		t1=typeCritere.getById(typeCahierChargeIdType);
		 t.setTypeCritere(t1);;
		 typeCahierCharges.save(t);
		   return typeCahierCharges.findAll();
	 }
	
	*/
	/*
	public List<TypeCahierCharges> supprimer(Long id) {
		typeCahierCharges.deleteById(id);
		return typeCahierCharges.findAll();
	}
	*/
	
	public List<Typecahiercharges> getAll(){
		return typeCahierCharges.findAll();
	}
	
	
	public Typecahiercharges getone(int id){
		return typeCahierCharges.getById(id);
	}
	
	
	//Ajouter
	public Typecahiercharges addtypeCahierCharge(Typecahiercharges typeCahierCharge) {
		// TODO Auto-generated method stub
		typeCahierCharges.save(typeCahierCharge);
		return typeCahierCharge;
	}
	
	//Modifier
	public Typecahiercharges updatetypeCahierCharge(Typecahiercharges typeCahierCharge) {
		this.typeCahierCharges.save(typeCahierCharge);
		return(typeCahierCharge);
	}
	
	//Supprimer
	public void deletetypeCahierCharge(int id) {
		// TODO Auto-generated method stub
		typeCahierCharges.deleteById(id);
	}
	
/*	
	public void update(Long id,Typecahiercharges t1,Long typeCahierChargeIdType) {
		Typecahiercharges t = new Typecahiercharges();
		TypeCritere t2=new  TypeCritere();
		t2=typeCritere.getById(typeCahierChargeIdType);
		t= typeCahierCharges.getById(id);
		t.setOrdre(t1.getOrdre());
		t.setTypeCahierDesChargesDescription(t1.getTypeCahierDesChargesDescription());
		t.setTypeCahierDesChargesDescription(t1.getTypeCahierDesChargesDescription());
		t.setTypeCritere(t2);
		typeCahierCharges.save(t);
		
	}

	
	
	
	
	*/
	
	
	

}
