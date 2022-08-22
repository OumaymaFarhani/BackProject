package tn.dossier.demo.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})

@Table(name = "typecahiercharges")
public class Typecahiercharges implements java.io.Serializable {
	

	private static final long serialVersionUID = 1L;
	private Integer typeCahierChargesId;
	private Integer ordre;
	private String typeCahierChargesLibelle;
	private String typeCahierDesChargesDescription;
	private String typeCahierDesChargesCode;
	/*	private List<Cahierclausesadministratives> cahierclausesadministratives = new ArrayList<Cahierclausesadministratives>(
			0);
	private List<Cahierclausesfinancierestechniques> cahierclausesfinancieresettechniques = new ArrayList<Cahierclausesfinancierestechniques>(
			0);
*/
	public Typecahiercharges() {
	}

	/*public Typecahiercharges(
			String typeCahierChargesLibelle,
			String typeCahierDesChargesDescription,
			String typeCahierDesChargesCode,
			List<Cahierclausesfinancierestechniques> cahierclausesfinancieresettechniques) {
		this.typeCahierChargesLibelle=typeCahierChargesLibelle;
		this.typeCahierDesChargesDescription = typeCahierDesChargesDescription;
		this.typeCahierDesChargesCode = typeCahierDesChargesCode;
		this.cahierclausesfinancieresettechniques = cahierclausesfinancieresettechniques;
	}
*/
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "typeCahierChargesId", unique = true, nullable = false)
	public Integer getTypeCahierChargesId() {
		return this.typeCahierChargesId;
	}

	public void setTypeCahierChargesId(Integer typeCahierChargesId) {
		this.typeCahierChargesId = typeCahierChargesId;
	}
	@Column(name = "typeCahierChargesLibelle", length = 254)
	public String getTypeCahierChargesLibelle() {
		return typeCahierChargesLibelle;
	}

	public void setTypeCahierChargesLibelle(String typeCahierChargesLibelle) {
		this.typeCahierChargesLibelle = typeCahierChargesLibelle;
	}

	@Column(name = "typeCahierChargesDescription", length = 254)
	public String getTypeCahierDesChargesDescription() {
		return this.typeCahierDesChargesDescription;
	}

	public void setTypeCahierDesChargesDescription(
			String typeCahierDesChargesDescription) {
		this.typeCahierDesChargesDescription = typeCahierDesChargesDescription;
	}

	@Column(name = "typeCahierChargesCode", length = 254)
	public String getTypeCahierDesChargesCode() {
		return this.typeCahierDesChargesCode;
	}

	public void setTypeCahierDesChargesCode(String typeCahierDesChargesCode) {
		this.typeCahierDesChargesCode = typeCahierDesChargesCode;
	}
	
	
	
public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecahiercharges")
	public Set<Cahierclausesadministratives> getCahierclausesadministratives() {
		return this.cahierclausesadministratives;
	}

	public void setCahierclausesadministratives(
			Set<Cahierclausesadministratives> cahierclausesadministratives) {
		this.cahierclausesadministratives = cahierclausesadministratives;
	}
	*/
	


	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecahiercharges")
	public List<Cahierclausesfinancierestechniques> getCahierclausesfinancierestechniques() {
		return this.cahierclausesfinancieresettechniques;
	}

	public void setCahierclausesfinancierestechniques(
			List<Cahierclausesfinancierestechniques> Cahierclausesfinancierestechniques) {
		this.cahierclausesfinancieresettechniques = cahierclausesfinancieresettechniques;
	}
*/
	public Typecahiercharges(String typeCahierChargesLibelle, String typeCahierDesChargesDescription,
			String typeCahierDesChargesCode) {
		super();
		this.typeCahierChargesLibelle = typeCahierChargesLibelle;
		this.typeCahierDesChargesDescription = typeCahierDesChargesDescription;
		this.typeCahierDesChargesCode = typeCahierDesChargesCode;
	}
	

	@Override
	public String toString() {
		return "Typecahiercharges [typeCahierChargesId=" + typeCahierChargesId + ", typeCahierChargesLibelle="
				+ typeCahierChargesLibelle + ", typeCahierDesChargesDescription=" + typeCahierDesChargesDescription
				+ ", typeCahierDesChargesCode=" + typeCahierDesChargesCode + "]";
	}



	
	
	

}
