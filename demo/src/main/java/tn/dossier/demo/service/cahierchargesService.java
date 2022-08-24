package tn.dossier.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
import tn.dossier.demo.repository.categoriesprojetRepository;

@Service
public class cahierchargesService {
	@Autowired
	private cahierchargesRepository c;
	@Autowired
	private categoriesprojetRepository de;
	@Autowired
	private CahierclausesadministrativesRepository cahierclausesadministratives;
	@Autowired
	private CahierclausesfinancierestechniquesRepository cahierclausesfinancierestechniques;
	@Autowired
	private TypeCahierChargesRepository typeCahierCharges;

	//getAll
		public List<CahierCharges> retrieveAllcahiercharges() {
			// TODO Auto-generated method stub
			return (List<CahierCharges>)c.findAll();
		}

		//Ajoutercahiercharges
				public CahierCharges addcahiercharges(CahierCharges c1) {
					// TODO Auto-generated method stub
						c.save(c1);
					return c1;
				}
				
				public CahierCharges ajoutercahiercharges(CahierCharges c1,int idD) {
					// TODO Auto-generated method stub
					
					
					Categoriesprojet d = new Categoriesprojet();
					d=de.getById(idD);
					c1.setCategoriesprojet(d);
					return c.save(c1);
				
				}
				
				//getOnecahiercharges
				public CahierCharges  getcahiercharges (long id) {
					return c.findById(id).isPresent() ? 
					        c.findById(id).get(): null;
					
				}
				
				
				
				//Modifiercahiercharges
				public CahierCharges updatecahiercharges(CahierCharges cc) {
					this.c.save(cc);
					return(cc);
				}
				
				//Supprimercahiercharges
				public void deletecahiercharges(long id) {
					// TODO Auto-generated method stub
					c.deleteById(id);
				}
		
/*				
		//ajouterClauseAdministrative
				public void ajouterClauseAdministartive(Cahierclausesadministratives  c1,Long idCahier,int idType,int idCategorie ) {
					
				CahierCharges x = new CahierCharges();
				Typecahiercharges y = new Typecahiercharges();
				Categoriesprojet z =new Categoriesprojet();
				x=c.getById(idCahier);
				y=typeCahierCharges.getById(idType);
				z=de.getById(idCategorie);
				c1.setCahiercharges(x);
				c1.setTypecahiercharges(y);
				c1.setCategoriesprojet(z);
					
				}
				
				//ajouterClauseFinnanciere
				public void ajouterClauseFinnanciere(Cahierclausesfinancierestechniques  c3,Long idCahier,int idType,int idCategorie ) {
					
				CahierCharges x = new CahierCharges();
				Typecahiercharges y = new Typecahiercharges();
				Categoriesprojet z =new Categoriesprojet();
				x=c.getById(idCahier);
				y=typeCahierCharges.getById(idType);
				z=de.getById(idCategorie);
				c3.setCahiercharges(x);
				c3.setTypecahiercharges(y);
				c3.setCategoriesprojet(z);
					
				}
				*/
				//ajoutClause
				public void ajouterClause(Cahierclausesfinancierestechniques  c3,Cahierclausesadministratives  c1,Long idCahier,int idType,int idCategorie) {
					
					if(idType == 1 || idType == 4) {
						CahierCharges x = new CahierCharges();
						Typecahiercharges y = new Typecahiercharges();
						Categoriesprojet z =new Categoriesprojet();
						x=c.getById(idCahier);
						y=typeCahierCharges.getById(idType);
						z=de.getById(idCategorie);
						c1.setCahiercharges(x);
						c1.setTypecahiercharges(y);
						c1.setCategoriesprojet(z);
						cahierclausesadministratives.save(c1);
						
					}
					else  {
						
						CahierCharges xx = new CahierCharges();
						Typecahiercharges yy = new Typecahiercharges();
						Categoriesprojet zz =new Categoriesprojet();
						xx=c.getById(idCahier);
						yy=typeCahierCharges.getById(idType);
						zz=de.getById(idCategorie);
						c3.setCahiercharges(xx);
						c3.setTypecahiercharges(yy);
						c3.setCategoriesprojet(zz);
						cahierclausesfinancierestechniques.save(c3);
					}
				}
				
				public String a1(Cahierclausesfinancierestechniques  c3,Long idCahier,int idType,int idCategorie) {
					Typecahiercharges yy = new Typecahiercharges();
					yy=typeCahierCharges.getById(idType);
					String oo ="";
					oo= yy.getTypeCahierChargesLibelle();
					if(oo.equals("CPS") || oo.equals("CCTP") ||oo.equals("CCF") ) {
						CahierCharges xx = new CahierCharges();
				
						Categoriesprojet zz =new Categoriesprojet();
						xx=c.getById(idCahier);
						//yy=typeCahierCharges.getById(idType);
						zz=de.getById(idCategorie);
						
						
						c3.setCahiercharges(xx);
						c3.setTypecahiercharges(yy);
						c3.setCategoriesprojet(zz);
						cahierclausesfinancierestechniques.save(c3);
						return "ajout avec succes";
						
					}
					else {
						return "impossible";
						
					}
				}
				
				public void ajoutClause(CahierClauseModel cahierClauseModel) {
					
					System.out.println(cahierClauseModel);
				Typecahiercharges type = new Typecahiercharges();
				type.setTypeCahierChargesId(cahierClauseModel.getTypecahiercharges().getTypeCahierChargesId());
					type.setTypeCahierChargesLibelle(cahierClauseModel.getTypecahiercharges().getTypeCahierChargesLibelle());
					
					if( type.getTypeCahierChargesLibelle().equals("CCAG") ||type.getTypeCahierChargesLibelle().equals("CCAP")||type.getTypeCahierChargesLibelle().equals("CPS")) {
						//insertion dans table admin
					Cahierclausesadministratives cahierclausesadministrative = new Cahierclausesadministratives();
					//cahierclausesadministrative.setCahierClausesAdministrativesId(cahierClauseModel.getCahierClausesAdministrativesId());
					cahierclausesadministrative.setCahierClausesAdministrativesLibelle(cahierClauseModel.getLibelle());
					cahierclausesadministrative.setCahiercharges(cahierClauseModel.getCahiercharges());
					cahierclausesadministrative.setCahierClausesAdministrativeDescription(cahierClauseModel.getDescription());
					cahierclausesadministrative.setCategoriesprojet(cahierClauseModel.getCategoriesprojet());
					cahierclausesadministrative.setTypecahiercharges(type);
					
						cahierclausesadministratives.save(cahierclausesadministrative);
					}
					else {
						//insertion table finananciere
						Cahierclausesfinancierestechniques cahierclausesfinancierestechnique = new Cahierclausesfinancierestechniques();
					//	cahierclausesfinancierestechnique.setCahierClausesFinancieresTechniquesId(cahierClauseModel.getCahierChargesId());
						cahierclausesfinancierestechnique.setCahiercharges(cahierClauseModel.getCahiercharges());
						
						cahierclausesfinancierestechnique.setCahierDesClauseFinancierTechnqueLibelle(cahierClauseModel.getLibelle());
						cahierclausesfinancierestechnique.setCahierClausesFinancieresTechniquesDescription(cahierClauseModel.getDescription());
						cahierclausesfinancierestechnique.setCategoriesprojet(cahierClauseModel.getCategoriesprojet());
						cahierclausesfinancierestechnique.setTypecahiercharges(type);
						cahierclausesfinancierestechniques.save(cahierclausesfinancierestechnique);
						
					}
				
				}
				
				
				
				
public void modifierClause(CahierClauseModel cahierClauseModel) {
					
					System.out.println(cahierClauseModel);
				Typecahiercharges type = new Typecahiercharges();
				type.setTypeCahierChargesId(cahierClauseModel.getTypecahiercharges().getTypeCahierChargesId());
					type.setTypeCahierChargesLibelle(cahierClauseModel.getTypecahiercharges().getTypeCahierChargesLibelle());
					
					if( type.getTypeCahierChargesLibelle().equals("CCAG") ||type.getTypeCahierChargesLibelle().equals("CCAP")||type.getTypeCahierChargesLibelle().equals("CPS")) {
						//insertion dans table admin
					Cahierclausesadministratives cahierclausesadministrative = new Cahierclausesadministratives();
					 cahierclausesadministrative.setCahierClausesAdministrativesId(cahierClauseModel.getCahierClausesAdministrativesId());
					cahierclausesadministrative.setCahierClausesAdministrativesLibelle(cahierClauseModel.getLibelle());
					cahierclausesadministrative.setCahiercharges(cahierClauseModel.getCahiercharges());
					cahierclausesadministrative.setCahierClausesAdministrativeDescription(cahierClauseModel.getDescription());
					cahierclausesadministrative.setCategoriesprojet(cahierClauseModel.getCategoriesprojet());
					cahierclausesadministrative.setTypecahiercharges(type);
					
						cahierclausesadministratives.save(cahierclausesadministrative);
					}
					else {
						//insertion table finananciere
						Cahierclausesfinancierestechniques cahierclausesfinancierestechnique = new Cahierclausesfinancierestechniques();
					//	cahierclausesfinancierestechnique.setCahierClausesFinancieresTechniquesId(cahierClauseModel.getCahierChargesId());
						cahierclausesfinancierestechnique.setCahiercharges(cahierClauseModel.getCahiercharges());
						
						cahierclausesfinancierestechnique.setCahierDesClauseFinancierTechnqueLibelle(cahierClauseModel.getLibelle());
						cahierclausesfinancierestechnique.setCahierClausesFinancieresTechniquesDescription(cahierClauseModel.getDescription());
						cahierclausesfinancierestechnique.setCategoriesprojet(cahierClauseModel.getCategoriesprojet());
						cahierclausesfinancierestechnique.setTypecahiercharges(type);
						cahierclausesfinancierestechniques.save(cahierclausesfinancierestechnique);
						
					}
				
				}
				
				
				public List<Typecahiercharges> removeTypes(
                        Long id) {

                    List<Typecahiercharges> listtypecahiercharge=new ArrayList<Typecahiercharges>();
					 List<Cahierclausesadministratives> listcahierclausesadministrative=new ArrayList<Cahierclausesadministratives>();
					 List<Cahierclausesfinancierestechniques> Listcahierclausefinanciertechnique =new ArrayList<Cahierclausesfinancierestechniques>();
					System.out.println("message");
					listcahierclausesadministrative=cahierclausesadministratives.findByCahierchargesCahierChargesId(id);
					listtypecahiercharge=typeCahierCharges.findAll();
					Listcahierclausefinanciertechnique=cahierclausesfinancierestechniques.findByCahierchargesCahierChargesId(id);
					
										
					if (listcahierclausesadministrative.size() > 0
							|| Listcahierclausefinanciertechnique.size() > 0) {

						for (int i = 0; i <= listcahierclausesadministrative.size() - 1; i++) {
							listtypecahiercharge.remove(listcahierclausesadministrative
									.get(i).getTypecahiercharges());
						}
						for (int j = 0; j <= Listcahierclausefinanciertechnique.size() - 1; j++) {
							listtypecahiercharge.remove(Listcahierclausefinanciertechnique
									.get(j).getTypecahiercharges());
						}
					}

					return listtypecahiercharge;

				}
				
				
				
				
				//Supprimercategoriesprojet
				public void deleteclause(long id) {
					
					
					CahierClauseModel cahierClauseModel=new CahierClauseModel();
				
					Typecahiercharges type = new Typecahiercharges();
					type.setTypeCahierChargesId(cahierClauseModel.getTypecahiercharges().getTypeCahierChargesId());
						type.setTypeCahierChargesLibelle(cahierClauseModel.getTypecahiercharges().getTypeCahierChargesLibelle());
						
						if( type.getTypeCahierChargesLibelle().equals("CCAG") ||type.getTypeCahierChargesLibelle().equals("CCAP")||type.getTypeCahierChargesLibelle().equals("CPS")) {
							
					cahierclausesadministratives.deleteById(id);
				}
						else 
							cahierclausesfinancierestechniques.deleteById(id);
				}
				
				
}
