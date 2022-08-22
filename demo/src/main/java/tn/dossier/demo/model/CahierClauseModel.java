package tn.dossier.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import tn.dossier.demo.entity.*;

public class CahierClauseModel   {
	private Long cahierClausesAdministrativesId;
	private Long cahierClausesFinancieresTechniquesId;
private int typeCahierChargesId;
	private String description;
	private String libelle;
	private Categoriesprojet categoriesprojet;
	private Long cahierChargesId;
	private Typecahiercharges typecahiercharges;
	private CahierCharges cahiercharges;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLibelle() {
		
		
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

	public CahierCharges getCahiercharges() {
		return cahiercharges;
	}
	public void setCahiercharges(CahierCharges cahiercharges) {
		this.cahiercharges = cahiercharges;
	}
	
	
	
	
	
	
	public Long getCahierChargesId() {
		return cahierChargesId;
	}
	public void setCahierChargesId(Long cahierChargesId) {
		this.cahierChargesId = cahierChargesId;
	}

	public int getTypeCahierChargesId() {
		return typeCahierChargesId;
	}
	public void setTypeCahierChargesId(int typeCahierChargesId) {
		this.typeCahierChargesId = typeCahierChargesId;
	}
	
	public Typecahiercharges getTypecahiercharges() {
		return typecahiercharges;
	}
	public void setTypecahiercharges(Typecahiercharges typecahiercharges) {
		this.typecahiercharges = typecahiercharges;
	}
	public Long getCahierClausesAdministrativesId() {
		return cahierClausesAdministrativesId;
	}
	public void setCahierClausesAdministrativesId(Long cahierClausesAdministrativesId) {
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
	}
	public Long getCahierClausesFinancieresTechniquesId() {
		return cahierClausesFinancieresTechniquesId;
	}
	public void setCahierClausesFinancieresTechniquesId(Long cahierClausesFinancieresTechniquesId) {
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
	}
	public CahierClauseModel(String description, String libelle, Categoriesprojet categorie,
			Typecahiercharges typecahiercharges,CahierCharges cahiercharges) {
		super();
		this.description = description;
		this.libelle = libelle;
		this.categoriesprojet = categorie;
		this.cahiercharges=cahiercharges;
		this.typecahiercharges = typecahiercharges;
	}
	
	
	
	
	public CahierClauseModel(Long cahierClausesAdministrativesId, String description, String libelle,
			Categoriesprojet categoriesprojet, Typecahiercharges typecahiercharges,
			CahierCharges cahiercharges) {
		super();
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
		this.description = description;
		this.libelle = libelle;
		this.categoriesprojet = categoriesprojet;
		this.typecahiercharges = typecahiercharges;
		this.cahiercharges = cahiercharges;
	}
	
	
	
	
	public CahierClauseModel() {
		
	}
	
	
	public CahierClauseModel(Long cahierClausesAdministrativesId, Long cahierClausesFinancieresTechniquesId,
			int typeCahierChargesId, String description, String libelle, Categoriesprojet categoriesprojet,
			Typecahiercharges typecahiercharges, CahierCharges cahiercharges) {
		super();
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
		this.typeCahierChargesId = typeCahierChargesId;
		this.description = description;
		this.libelle = libelle;
		this.categoriesprojet = categoriesprojet;
		this.typecahiercharges = typecahiercharges;
		this.cahiercharges = cahiercharges;
	}
	public Categoriesprojet getCategoriesprojet() {
		return categoriesprojet;
	}
	public void setCategoriesprojet(Categoriesprojet categoriesprojet) {
		this.categoriesprojet = categoriesprojet;
	}

	@Override
	public String toString() {
		return "CahierClauseModel [cahierClausesAdministrativesId=" + cahierClausesAdministrativesId
				+ ", cahierClausesFinancieresTechniquesId=" + cahierClausesFinancieresTechniquesId
				+ ", typeCahierChargesId=" + typeCahierChargesId + ", description=" + description + ", libelle="
				+ libelle + ", categoriesprojet=" + categoriesprojet + ", typecahiercharges=" + typecahiercharges
				+ ", cahiercharges=" + cahiercharges + "]";
	}
	
	


	/*
	@Override
	public String toString() {
		return "CahierClauseModel [cahierClausesAdministrativesId=" + cahierClausesAdministrativesId
				+ ", cahierClausesFinancieresTechniquesId=" + cahierClausesFinancieresTechniquesId
				+ ", typeCahierChargesId=" + typeCahierChargesId + ", description=" + description + ", libelle="
				+ libelle + ", categoriesprojet=" + categoriesprojet + ", typecahiercharges=" + typecahiercharges
				+ ", cahiercharges=" + cahiercharges + "]";
	}
	
	*/
	

}
