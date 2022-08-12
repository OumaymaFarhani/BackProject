package tn.dossier.demo.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "cahierclausesfinancierestechniquestype")
public class Cahierclausesfinancierestechniquestype implements java.io.Serializable{
	private static final long serialVersionUID = -3117586193429367585L;
	private Long cahierClausesFinancieresTechniquesId ;
	
	private Categoriesprojet categoriesprojettype;
	private Typecahiercharges typecahierchargestype;
	private Cahierchargestype cahierchargestype;
	private String cahierDesClauseFinancierTechnqueLibelle;
	private String cahierClausesFinancieresTechniquesDescription;
	private Date CahierClauseFinanciereesTechniqueDateCration;
//	private Set<Criterescahierclausesfinancierestechniquestype> criterescahierclausesfinancierestechniquestypes = new HashSet<Criterescahierclausesfinancierestechniquestype>(
//			0);

	public Cahierclausesfinancierestechniquestype() {
	}

	public Cahierclausesfinancierestechniquestype(
			Typecahiercharges typecahierchargestype,
			Cahierchargestype cahierchargestype) {
		this.typecahierchargestype = typecahierchargestype;
		this.cahierchargestype = cahierchargestype;
	}

	public Cahierclausesfinancierestechniquestype(
			Categoriesprojet categoriesprojettype,
			Typecahiercharges typecahierchargestype,
			Cahierchargestype cahierchargestype,
			String cahierDesClauseFinancierTechnqueLibelle,
			String cahierClausesFinancieresTechniquesDescription) {
		this.categoriesprojettype = categoriesprojettype;
		this.typecahierchargestype = typecahierchargestype;
		this.cahierchargestype = cahierchargestype;
		this.cahierDesClauseFinancierTechnqueLibelle = cahierDesClauseFinancierTechnqueLibelle;
		this.cahierClausesFinancieresTechniquesDescription = cahierClausesFinancieresTechniquesDescription;
//		this.criterescahierclausesfinancierestechniquestypes = criterescahierclausesfinancierestechniquestypes;
	}

	@Id
	
	@Column(name = "cahierClausesFinancieresTechniquesId", unique = true, nullable = false)
	public Long getCahierClausesFinancieresTechniquesId() {
		return this.cahierClausesFinancieresTechniquesId;
	}

	public void setCahierClausesFinancieresTechniquesId(
			Long cahierClausesFinancieresTechniquesId) {
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriesProjetId")
	public Categoriesprojet getCategoriesprojettype() {
		return this.categoriesprojettype;
	}

	public void setCategoriesprojettype(
			Categoriesprojet categoriesprojettype) {
		this.categoriesprojettype = categoriesprojettype;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeCahierDesChargesId")
	public Typecahiercharges getTypecahierchargestype() {
		return this.typecahierchargestype;
	}

	public void setTypecahierchargestype(
			Typecahiercharges typecahierchargestype) {
		this.typecahierchargestype = typecahierchargestype;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "cahierChargesId")
	public Cahierchargestype getCahierchargestype() {
		return this.cahierchargestype;
	}

	public void setCahierchargestype(Cahierchargestype cahierchargestype) {
		this.cahierchargestype = cahierchargestype;
	}

	@Column(name = "CahierDesClauseFinancierTechnqueLibelle", length = 50)
	public String getCahierDesClauseFinancierTechnqueLibelle() {
		return this.cahierDesClauseFinancierTechnqueLibelle;
	}

	public void setCahierDesClauseFinancierTechnqueLibelle(
			String cahierDesClauseFinancierTechnqueLibelle) {
		this.cahierDesClauseFinancierTechnqueLibelle = cahierDesClauseFinancierTechnqueLibelle;
	}

	@Column(name = "cahierClausesFinancieresTechniquesDescription", length = 65535)
	public String getCahierClausesFinancieresTechniquesDescription() {
		return this.cahierClausesFinancieresTechniquesDescription;
	}

	public void setCahierClausesFinancieresTechniquesDescription(
			String cahierClausesFinancieresTechniquesDescription) {
		this.cahierClausesFinancieresTechniquesDescription = cahierClausesFinancieresTechniquesDescription;
	}

//	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cahierclausesfinancierestechniquestype")
//	@Fetch(value = FetchMode.SUBSELECT)
//	public Set<Criterescahierclausesfinancierestechniquestype> getCriterescahierclausesfinancierestechniquestypes() {
//		return this.criterescahierclausesfinancierestechniquestypes;
//	}
//
//	public void setCriterescahierclausesfinancierestechniquestypes(
//			Set<Criterescahierclausesfinancierestechniquestype> criterescahierclausesfinancierestechniquestypes) {
//		this.criterescahierclausesfinancierestechniquestypes = criterescahierclausesfinancierestechniquestypes;
//	}
	@Column(name = "CahierClauseFinanciereesTechniqueDateCration", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCahierClauseFinanciereesTechniqueDateCration() {
		return CahierClauseFinanciereesTechniqueDateCration;
	}

	public void setCahierClauseFinanciereesTechniqueDateCration(Date cahierClauseFinanciereesTechniqueDateCration) {
		CahierClauseFinanciereesTechniqueDateCration = cahierClauseFinanciereesTechniqueDateCration;
	}


	

	

}
