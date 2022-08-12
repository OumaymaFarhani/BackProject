package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "intervallestype")
public class Intervallestype implements java.io.Serializable{
	private static final long serialVersionUID = -9201613714289686030L;
	private Long intervallesId;
	private Operateurs operateurstypeByOperateursSuperieurId;
	private Operateurs operateurstypeByOpeOperateursId;
	private Criterescahierclausesfinancierestechniquestype criterescahierclausesfinancierestechniquestype;
	private Float intervallesInferieur;
	private Float intervallesSuperieur;
	private Float intervallesBareme;

	public Intervallestype() {
	}

	public Intervallestype(
			Operateurs operateurstypeByOperateursSuperieurId,
			Operateurs operateurstypeByOpeOperateursId,
			Criterescahierclausesfinancierestechniquestype criterescahierclausesfinancierestechniquestype,
			Float intervallesInferieur, Float intervallesSuperieur,
			Float intervallesBareme) {
		this.operateurstypeByOperateursSuperieurId = operateurstypeByOperateursSuperieurId;
		this.operateurstypeByOpeOperateursId = operateurstypeByOpeOperateursId;
		this.criterescahierclausesfinancierestechniquestype = criterescahierclausesfinancierestechniquestype;
		this.intervallesInferieur = intervallesInferieur;
		this.intervallesSuperieur = intervallesSuperieur;
		this.intervallesBareme = intervallesBareme;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "intervallesId", unique = true, nullable = false)
	public Long getIntervallesId() {
		return this.intervallesId;
	}

	public void setIntervallesId(Long intervallesId) {
		this.intervallesId = intervallesId;
	}
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "operateursSuperieurId")
	public Operateurs getOperateurstypeByOperateursSuperieurId() {
		return this.operateurstypeByOperateursSuperieurId;
	}

	public void setOperateurstypeByOperateursSuperieurId(
			Operateurs operateurstypeByOperateursSuperieurId) {
		this.operateurstypeByOperateursSuperieurId = operateurstypeByOperateursSuperieurId;
	}
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ope_operateursId")
	public Operateurs getOperateurstypeByOpeOperateursId() {
		return this.operateurstypeByOpeOperateursId;
	}

	public void setOperateurstypeByOpeOperateursId(
			Operateurs operateurstypeByOpeOperateursId) {
		this.operateurstypeByOpeOperateursId = operateurstypeByOpeOperateursId;
	}
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "cahierClausesFinancieresTechniquesId", referencedColumnName = "cahierClausesFinancieresTechniquesId"),
			@JoinColumn(name = "criteresId", referencedColumnName = "criteresId") })
	public Criterescahierclausesfinancierestechniquestype getCriterescahierclausesfinancierestechniquestype() {
		return this.criterescahierclausesfinancierestechniquestype;
	}

	public void setCriterescahierclausesfinancierestechniquestype(
			Criterescahierclausesfinancierestechniquestype criterescahierclausesfinancierestechniquestype) {
		this.criterescahierclausesfinancierestechniquestype = criterescahierclausesfinancierestechniquestype;
	}

	@Column(name = "intervallesInferieur", precision = 12, scale = 0)
	public Float getIntervallesInferieur() {
		return this.intervallesInferieur;
	}

	public void setIntervallesInferieur(Float intervallesInferieur) {
		this.intervallesInferieur = intervallesInferieur;
	}

	@Column(name = "intervallesSuperieur", precision = 12, scale = 0)
	public Float getIntervallesSuperieur() {
		return this.intervallesSuperieur;
	}

	public void setIntervallesSuperieur(Float intervallesSuperieur) {
		this.intervallesSuperieur = intervallesSuperieur;
	}

	@Column(name = "intervallesBareme", precision = 12, scale = 0)
	public Float getIntervallesBareme() {
		return this.intervallesBareme;
	}

	public void setIntervallesBareme(Float intervallesBareme) {
		this.intervallesBareme = intervallesBareme;
	}


}
