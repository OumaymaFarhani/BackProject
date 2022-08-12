package tn.dossier.demo.entity;


import java.util.Date;

// Generated 6 ao�t 2013 15:04:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cahierclausesadministratives")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Cahierclausesadministratives {
	private static final long serialVersionUID = -4405622908955932464L;
	private Long cahierClausesAdministrativesId;
	private Categoriesprojet categoriesprojet;
	private Typecahiercharges typecahiercharges;
	private CahierCharges cahiercharges;
	private String cahierClausesAdministrativesLibelle;
	private String cahierClausesAdministrativeDescription;
	private Date CahierClauseAdministrativeReelDateCration;
//	private Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses = new HashSet<Criterescahierclausesadministratives>(
//			0);

	public Cahierclausesadministratives() {
	}

	public Cahierclausesadministratives(CahierCharges cahiercharges) {
		this.cahiercharges = cahiercharges;
	}

	public Cahierclausesadministratives(
			Categoriesprojet categoriesprojet,
			Typecahiercharges typecahiercharges,
			CahierCharges cahiercharges,
			String cahierClausesAdministrativesLibelle,
			String cahierClausesAdministrativeDescription) {
		this.categoriesprojet = categoriesprojet;
		this.typecahiercharges = typecahiercharges;
		this.cahiercharges = cahiercharges;
		this.cahierClausesAdministrativesLibelle = cahierClausesAdministrativesLibelle;
		this.cahierClausesAdministrativeDescription = cahierClausesAdministrativeDescription;
	//	this.criterescahierclausesadministrativeses = criterescahierclausesadministrativeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cahierClausesAdministrativesId", unique = true, nullable = false)
	public Long getCahierClausesAdministrativesId() {
		return this.cahierClausesAdministrativesId;
	}

	public void setCahierClausesAdministrativesId(
			Long cahierClausesAdministrativesId) {
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriesProjetId")
	public Categoriesprojet getCategoriesprojet() {
		return this.categoriesprojet;
	}

	public void setCategoriesprojet(Categoriesprojet categoriesprojet) {
		this.categoriesprojet = categoriesprojet;
	}
	//@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typeCahierdesChargesId")
	public Typecahiercharges getTypecahiercharges() {
		return this.typecahiercharges;
	}

	public void setTypecahiercharges(Typecahiercharges typecahiercharges) {
		this.typecahiercharges = typecahiercharges;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahierChargesId")
	public CahierCharges getCahiercharges() {
		return cahiercharges;
	}

	public void setCahiercharges(CahierCharges cahiercharges) {
		this.cahiercharges = cahiercharges;
	}

	@Column(name = "cahierClausesAdministrativesLibelle", length = 100)
	public String getCahierClausesAdministrativesLibelle() {
		return this.cahierClausesAdministrativesLibelle;
	}

	public void setCahierClausesAdministrativesLibelle(
			String cahierClausesAdministrativesLibelle) {
		this.cahierClausesAdministrativesLibelle = cahierClausesAdministrativesLibelle;
	}

	@Column(name = "cahierClausesAdministrativeDescription", length = 65535)
	public String getCahierClausesAdministrativeDescription() {
		return this.cahierClausesAdministrativeDescription;
	}

	public void setCahierClausesAdministrativeDescription(
			String cahierClausesAdministrativeDescription) {
		this.cahierClausesAdministrativeDescription = cahierClausesAdministrativeDescription;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierclausesadministratives")
//	public Set<Criterescahierclausesadministratives> getCriterescahierclausesadministrativeses() {
//		return this.criterescahierclausesadministrativeses;
//	}
//
//	public void setCriterescahierclausesadministrativeses(
//			Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses) {
//		this.criterescahierclausesadministrativeses = criterescahierclausesadministrativeses;
//	}
	@Column(name = "CahierClauseAdministrativeReelDateCration", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCahierClauseAdministrativeReelDateCration() {
		return CahierClauseAdministrativeReelDateCration;
	}

	public void setCahierClauseAdministrativeReelDateCration(Date cahierClauseAdministrativeReelDateCration) {
		CahierClauseAdministrativeReelDateCration = cahierClauseAdministrativeReelDateCration;
	}
	


}
