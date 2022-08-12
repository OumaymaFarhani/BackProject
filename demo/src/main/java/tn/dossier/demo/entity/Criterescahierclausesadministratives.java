package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;

import javax.persistence.EmbeddedId;
@Entity
@Table(name = "criterescahierclausesadministratives")
public class Criterescahierclausesadministratives implements java.io.Serializable {
	private static final long serialVersionUID = -6550561221140208383L;
	private CriterescahierclausesadministrativesId id;
	private Criteres criteres;
	private Cahierclausesadministratives cahierclausesadministratives;
	private Integer criteresCahierClausesAdministrativesValeur;
	private Boolean criteresCahierClausesAdministrativesElimination;
	private Long criteresCahierClausesAdministrativesIdCritereAffecter;


	public Criterescahierclausesadministratives() {
	}

	public Criterescahierclausesadministratives(
			CriterescahierclausesadministrativesId id, Criteres criteres,
			Cahierclausesadministratives cahierclausesadministratives) {
		this.id = id;
		this.criteres = criteres;
		this.cahierclausesadministratives = cahierclausesadministratives;
	}

	public Criterescahierclausesadministratives(
			CriterescahierclausesadministrativesId id, Criteres criteres,
			Cahierclausesadministratives cahierclausesadministratives,
			Integer criteresCahierClausesAdministrativesValeur,
			Boolean criteresCahierClausesAdministrativesElimination,
			Long criteresCahierClausesAdministrativesIdCritereAffecter) {
		this.id = id;
		this.criteres = criteres;
		this.cahierclausesadministratives = cahierclausesadministratives;
		this.criteresCahierClausesAdministrativesValeur = criteresCahierClausesAdministrativesValeur;
		this.criteresCahierClausesAdministrativesElimination = criteresCahierClausesAdministrativesElimination;
		this.criteresCahierClausesAdministrativesIdCritereAffecter = criteresCahierClausesAdministrativesIdCritereAffecter;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cahierClausesAdministrativesId", column = @Column(name = "cahierClausesAdministrativesId", nullable = false)),
			@AttributeOverride(name = "criteresId", column = @Column(name = "criteresId", nullable = false)) })
	public CriterescahierclausesadministrativesId getId() {
		return this.id;
	}

	public void setId(CriterescahierclausesadministrativesId id) {
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
	@JoinColumn(name = "cahierClausesAdministrativesId", nullable = false, insertable = false, updatable = false)
	public Cahierclausesadministratives getCahierclausesadministratives() {
		return this.cahierclausesadministratives;
	}

	public void setCahierclausesadministratives(
			Cahierclausesadministratives cahierclausesadministratives) {
		this.cahierclausesadministratives = cahierclausesadministratives;
	}

	@Column(name = "criteresCahierClausesAdministrativesValeur")
	public Integer getCriteresCahierClausesAdministrativesValeur() {
		return this.criteresCahierClausesAdministrativesValeur;
	}

	public void setCriteresCahierClausesAdministrativesValeur(
			Integer criteresCahierClausesAdministrativesValeur) {
		this.criteresCahierClausesAdministrativesValeur = criteresCahierClausesAdministrativesValeur;
	}

	@Column(name = "criteresCahierClausesAdministrativesElimination")
	public Boolean getCriteresCahierClausesAdministrativesElimination() {
		return this.criteresCahierClausesAdministrativesElimination;
	}

	public void setCriteresCahierClausesAdministrativesElimination(
			Boolean criteresCahierClausesAdministrativesElimination) {
		this.criteresCahierClausesAdministrativesElimination = criteresCahierClausesAdministrativesElimination;
	}

	@Column(name = "criteresCahierClausesAdministrativesIdCritereAffecter")
	public Long getCriteresCahierClausesAdministrativesIdCritereAffecter() {
		return this.criteresCahierClausesAdministrativesIdCritereAffecter;
	}

	public void setCriteresCahierClausesAdministrativesIdCritereAffecter(
			Long criteresCahierClausesAdministrativesIdCritereAffecter) {
		this.criteresCahierClausesAdministrativesIdCritereAffecter = criteresCahierClausesAdministrativesIdCritereAffecter;
	}

	

}
