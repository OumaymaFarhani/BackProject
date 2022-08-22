package tn.dossier.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.dossier.demo.entity.CahierCharges;
import tn.dossier.demo.entity.Cahierclausesadministratives;
import tn.dossier.demo.entity.Cahierclausesfinancierestechniques;
import tn.dossier.demo.entity.Categoriesprojet;
import tn.dossier.demo.entity.Typecahiercharges;
import tn.dossier.demo.model.CahierClauseModel;
import tn.dossier.demo.repository.CahierclausesadministrativesRepository;
import tn.dossier.demo.repository.CahierclausesfinancierestechniquesRepository;
import tn.dossier.demo.repository.TypeCahierChargesRepository;
import tn.dossier.demo.repository.cahierchargesRepository;

@Service
public class CahierclausesadministrativesService {
	@Autowired
	private CahierclausesadministrativesRepository cahierclausesadministratives;
	@Autowired
	private cahierchargesRepository cahiercharges;
	@Autowired
	private CahierclausesfinancierestechniquesRepository cc;
	@Autowired
	private TypeCahierChargesRepository typeCahierCharges;

	
	//getAll
			public List<Cahierclausesadministratives> retrieveAllcahierclausesadministratives() {
				// TODO Auto-generated method stub
				return (List<Cahierclausesadministratives>)cahierclausesadministratives.findAll();
			}
			
			
			//getOne
			public Cahierclausesadministratives  getCahierclausesadministratives (long id) {
				return cahierclausesadministratives.findById(id).get();
				
			}
			public List<Cahierclausesadministratives> retrieveAllcahierclausesadministrativesByCahierCharge(Long id) {
				// TODO Auto-generated method stub
				return  cahierclausesadministratives.findByCahierchargesCahierChargesId(id);
			}
			
		
		public List<Object>	retrieve(Long id){
			List<Cahierclausesadministratives> list;
			List<Cahierclausesfinancierestechniques> list2;
			
			 list= 	cahierclausesadministratives.findByCahierchargesCahierChargesId(id);
			 list2=	cc.findByCahierchargesCahierChargesId(id);
		 
			return( List<Object> ) Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
			
		}
		
		//getOne
		public Object  getclause (Long id) {
			Typecahiercharges type = new Typecahiercharges();
			CahierClauseModel cahierClauseModel =new CahierClauseModel();
			type=typeCahierCharges.getById(cahierClauseModel.getTypeCahierChargesId());
				
				if( type.getTypeCahierChargesLibelle().equals("CCAG") ||type.getTypeCahierChargesLibelle().equals("CCAP"))
				
				
			return cahierclausesadministratives.findById(id).get();
				else
					return cc.findById(id).get();
							
		}
		

		//SupprimerClauseAdministrative
		public void deleteClause(long id) {
			// TODO Auto-generated method stub
			cahierclausesadministratives.deleteById(id);
		}
		
		
		//public List<Criterescahierclausesadministratives> 
			
		

}
