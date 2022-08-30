package tn.dossier.demo.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "criterescahierclausesfinancierestechniques")
public class Criterescahierclausesfinancierestechniques  implements java.io.Serializable{
	
	private static final long serialVersionUID = 4985047415432478280L;
	private CriterescahierclausesfinancierestechniquesId id;
	private Criteres criteres;
	private Cahierclausesfinancierestechniques cahierclausesfinancierestechniques;
	private Integer criteresCahierClausesFinancieresTechniquesValeur;
	private Boolean criteresCahierClausesFinancieresTechniquesElimination;
	private Integer criteresCahierClausesFinancieresTechniquesBareme;
	private Integer criteresCahierClausesFinancieresTechniquesQuantite;
	private Float criteresCahierClausesFinancieresTechniquesBudjet;
	private Long criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
	
	
//	private Set<Intervalles> intervalleses = new HashSet<Intervalles>(0);

	public Criterescahierclausesfinancierestechniques() {
	}

	public Criterescahierclausesfinancierestechniques(
			CriterescahierclausesfinancierestechniquesId id,
			Criteres criteres,
			Cahierclausesfinancierestechniques cahierclausesfinancierestechniques) {
		this.id = id;
		this.criteres = criteres;
		this.cahierclausesfinancierestechniques = cahierclausesfinancierestechniques;
	}

	public Criterescahierclausesfinancierestechniques(
			CriterescahierclausesfinancierestechniquesId id,
			Criteres criteres,
			Cahierclausesfinancierestechniques cahierclausesfinancierestechniques,
			Integer criteresCahierClausesFinancieresTechniquesValeur,
			Boolean criteresCahierClausesFinancieresTechniquesElimination,
			Integer criteresCahierClausesFinancieresTechniquesBareme,
			Integer criteresCahierClausesFinancieresTechniquesQuantite,
			Float criteresCahierClausesFinancieresTechniquesBudjet,
			Long criteresCahierClausesFinancieresTechniquesIdCritereAffecter
			) {
		this.id = id;
		this.criteres = criteres;
		this.cahierclausesfinancierestechniques = cahierclausesfinancierestechniques;
		this.criteresCahierClausesFinancieresTechniquesValeur = criteresCahierClausesFinancieresTechniquesValeur;
		this.criteresCahierClausesFinancieresTechniquesElimination = criteresCahierClausesFinancieresTechniquesElimination;
		this.criteresCahierClausesFinancieresTechniquesBareme = criteresCahierClausesFinancieresTechniquesBareme;
		this.criteresCahierClausesFinancieresTechniquesQuantite = criteresCahierClausesFinancieresTechniquesQuantite;
		this.criteresCahierClausesFinancieresTechniquesBudjet = criteresCahierClausesFinancieresTechniquesBudjet;
		this.criteresCahierClausesFinancieresTechniquesIdCritereAffecter = criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
		
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cahierClausesFinancieresTechniquesId", column = @Column(name = "cahierClausesFinancieresTechniquesId", nullable = false)),
			@AttributeOverride(name = "criteresId", column = @Column(name = "criteresId", nullable = false)) })
	public CriterescahierclausesfinancierestechniquesId getId() {
		return this.id;
	}

	public void setId(CriterescahierclausesfinancierestechniquesId id) {
		this.id = id;
	}
	 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "criteresId", nullable = false, insertable = false, updatable = false)
	public Criteres getCriteres() {
		return this.criteres;
	}

	public void setCriteres(Criteres criteres) {
		this.criteres = criteres;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahierClausesFinancieresTechniquesId", nullable = false, insertable = false, updatable = false)
	public Cahierclausesfinancierestechniques getCahierclausesfinancierestechniques() {
		return this.cahierclausesfinancierestechniques;
	}

	public void setCahierclausesfinancierestechniques(
			Cahierclausesfinancierestechniques cahierclausesfinancierestechniques) {
		this.cahierclausesfinancierestechniques = cahierclausesfinancierestechniques;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesValeur")
	public Integer getCriteresCahierClausesFinancieresTechniquesValeur() {
		return this.criteresCahierClausesFinancieresTechniquesValeur;
	}

	public void setCriteresCahierClausesFinancieresTechniquesValeur(
			Integer criteresCahierClausesFinancieresTechniquesValeur) {
		this.criteresCahierClausesFinancieresTechniquesValeur = criteresCahierClausesFinancieresTechniquesValeur;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesElimination")
	public Boolean getCriteresCahierClausesFinancieresTechniquesElimination() {
		return this.criteresCahierClausesFinancieresTechniquesElimination;
	}

	public void setCriteresCahierClausesFinancieresTechniquesElimination(
			Boolean criteresCahierClausesFinancieresTechniquesElimination) {
		this.criteresCahierClausesFinancieresTechniquesElimination = criteresCahierClausesFinancieresTechniquesElimination;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesBareme")
	public Integer getCriteresCahierClausesFinancieresTechniquesBareme() {
		return this.criteresCahierClausesFinancieresTechniquesBareme;
	}

	public void setCriteresCahierClausesFinancieresTechniquesBareme(
			Integer criteresCahierClausesFinancieresTechniquesBareme) {
		this.criteresCahierClausesFinancieresTechniquesBareme = criteresCahierClausesFinancieresTechniquesBareme;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesQuantite")
	public Integer getCriteresCahierClausesFinancieresTechniquesQuantite() {
		return this.criteresCahierClausesFinancieresTechniquesQuantite;
	}

	public void setCriteresCahierClausesFinancieresTechniquesQuantite(
			Integer criteresCahierClausesFinancieresTechniquesQuantite) {
		this.criteresCahierClausesFinancieresTechniquesQuantite = criteresCahierClausesFinancieresTechniquesQuantite;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesBudjet", precision = 12, scale = 0)
	public Float getCriteresCahierClausesFinancieresTechniquesBudjet() {
		return this.criteresCahierClausesFinancieresTechniquesBudjet;
	}

	public void setCriteresCahierClausesFinancieresTechniquesBudjet(
			Float criteresCahierClausesFinancieresTechniquesBudjet) {
		this.criteresCahierClausesFinancieresTechniquesBudjet = criteresCahierClausesFinancieresTechniquesBudjet;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesIdCritereAffecter")
	public Long getCriteresCahierClausesFinancieresTechniquesIdCritereAffecter() {
		return this.criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
	}

	public void setCriteresCahierClausesFinancieresTechniquesIdCritereAffecter(
			Long criteresCahierClausesFinancieresTechniquesIdCritereAffecter) {
		this.criteresCahierClausesFinancieresTechniquesIdCritereAffecter = criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
	}
/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "criterescahierclausesfinancierestechniques")
	public Set<Intervalles> getIntervalleses() {
		return this.intervalleses;
	}

	public void setIntervalleses(Set<Intervalles> intervalleses) {
		this.intervalleses = intervalleses;
	}
*/
}
