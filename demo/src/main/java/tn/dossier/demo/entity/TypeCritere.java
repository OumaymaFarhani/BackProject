package tn.dossier.demo.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})*/

@Entity
@Table(name = "typecritere")
public class TypeCritere implements java.io.Serializable {
	
	private static final long serialVersionUID = 1838637383989226761L;
	private Long typeCritereId;
	private String typeCritereLibelle;
	private String typeCritereDescription;
	private Set<Criteres> critereses = new HashSet<Criteres>(0);
//	private Set<Typecahiercharges> typecahiercharges = new HashSet<Typecahiercharges>(
//			0);

	public TypeCritere() {
	}

	public TypeCritere(String typeCritereLibelle,
			String typeCritereDescription, Set<Criteres> critereses) {
		this.typeCritereLibelle = typeCritereLibelle;
		this.typeCritereDescription = typeCritereDescription;
		this.critereses = critereses;
//		this.typecahiercharges = typecahierchargeses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "typeCritereId", unique = true, nullable = false)
	public Long getTypeCritereId() {
		return this.typeCritereId;
	}

	public void setTypeCritereId(Long typeCritereId) {
		this.typeCritereId = typeCritereId;
	}

	@Column(name = "typeCritereLibelle", length = 50)
	public String getTypeCritereLibelle() {
		return this.typeCritereLibelle;
	}

	public void setTypeCritereLibelle(String typeCritereLibelle) {
		this.typeCritereLibelle = typeCritereLibelle;
	}

	@Column(name = "typeCritereDescription", length = 65535)
	public String getTypeCritereDescription() {
		return this.typeCritereDescription;
	}

	public void setTypeCritereDescription(String typeCritereDescription) {
		this.typeCritereDescription = typeCritereDescription;
	}

/*

@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecritere")

	public Set<Criteres> getCritereses() {
		return critereses;
	}

	public void setCritereses(Set<Criteres> critereses) {
		this.critereses = critereses;
	}
*/
//
//@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecritere")
//	public Set<Typecahiercharges> getTypecahiercharges() {
//		return typecahiercharges;
//	}
//
//	public void setTypecahiercharges(Set<Typecahiercharges> typecahiercharges) {
//		this.typecahiercharges = typecahiercharges;
//	}

	

}
