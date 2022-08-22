package tn.dossier.demo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "criterestype")
public class Criterestype implements java.io.Serializable {
	private static final long serialVersionUID = 4173104594796863960L;
	private Long criteresId;
	private Criterestype criterestype;
	private Categoriesprojet categoriesprojettype;
	private TypeCritere typecriteretype;
	private Naturecritere naturecritere;
	private String criteresLibelle;
	private String criteresAbreviation;
	private Boolean criteresElimination;
	private String criteresDescription;
//	private Set<Criterescategoriesprojettype> criterescategoriesprojettypes = new HashSet<Criterescategoriesprojettype>(
//			0);
	private Set<Criterescahierclausesfinancierestechniquestype> criterescahierclausesfinancierestechniquestypes = new HashSet<Criterescahierclausesfinancierestechniquestype>(
			0);
//	private Set<Criterestype> criterestypes = new HashSet<Criterestype>(0);
//	private Set<Criterescahierclausesadministrativestype> criterescahierclausesadministrativestypes = new HashSet<Criterescahierclausesadministrativestype>(
	//		0);

	public Criterestype() {
	}

	

	public Criterestype(
			Criterestype criterestype,
			Categoriesprojet categoriesprojettype,
			TypeCritere typecritere,
			Naturecritere naturecritere,
			String criteresLibelle,
			String criteresAbreviation,
			Boolean criteresElimination,
			String criteresDescription) {
		this.criterestype = criterestype;
		this.categoriesprojettype = categoriesprojettype;
		this.typecriteretype = typecritere;
		this.naturecritere = naturecritere;
		this.criteresLibelle = criteresLibelle;
		this.criteresAbreviation = criteresAbreviation;
		this.criteresElimination = criteresElimination;
		this.criteresDescription = criteresDescription;
	}
	

//	public Criterestype(Criterestype criterestype, Categoriesprojet categoriesprojettype, TypeCritere typecriteretype,
//			Naturecritere naturecritere, String criteresLibelle, String criteresAbreviation,
//			Boolean criteresElimination, String criteresDescription) {
//		super();
//		this.criterestype = criterestype;
//		this.categoriesprojettype = categoriesprojettype;
//		this.typecriteretype = typecriteretype;
//		this.naturecritere = naturecritere;
//		this.criteresLibelle = criteresLibelle;
//		this.criteresAbreviation = criteresAbreviation;
//		this.criteresElimination = criteresElimination;
//		this.criteresDescription = criteresDescription;
////		this.criterescategoriesprojettypes = criterescategoriesprojettypes;
////		this.criterescahierclausesfinancierestechniquestypes = criterescahierclausesfinancierestechniquestypes;
//	}
	

//	public Criterestype(Criterestype criterestype, Categoriesprojet categoriesprojettype, TypeCritere typecriteretype,
//			Naturecritere naturecritere, String criteresLibelle, String criteresAbreviation,
//			Boolean criteresElimination, String criteresDescription) {
//		super();
//		this.criterestype = criterestype;
//		this.categoriesprojettype = categoriesprojettype;
//		this.typecriteretype = typecriteretype;
//		this.naturecritere = naturecritere;
//		this.criteresLibelle = criteresLibelle;
//		this.criteresAbreviation = criteresAbreviation;
//		this.criteresElimination = criteresElimination;
//		this.criteresDescription = criteresDescription;
////		this.criterescategoriesprojettypes = criterescategoriesprojettypes;
////		this.criterescahierclausesfinancierestechniquestypes = criterescahierclausesfinancierestechniquestypes;
////		this.criterestypes = criterestypes;
//	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "criteresId", unique = true, nullable = false)
	public Long getCriteresId() {
		return this.criteresId;
	}

	public void setCriteresId(Long criteresId) {
		this.criteresId = criteresId;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade={CascadeType.ALL})
	@JoinColumn(name = "Cri_criteresId")
	public Criterestype getCriterestype() {
		return this.criterestype;
	}

	public void setCriterestype(Criterestype criterestype) {
		this.criterestype = criterestype;
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

	@ManyToOne
	@JoinColumn(name = "typeCritereId")
	public TypeCritere getTypecriteretype() {
		return this.typecriteretype;
	}

	public void setTypecriteretype(TypeCritere typecriteretype) {
		this.typecriteretype = typecriteretype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "natureCritereId")
	public Naturecritere getNaturecritere() {
		return this.naturecritere;
	}

	public void setNaturecritere(Naturecritere naturecriteretype) {
		this.naturecritere = naturecriteretype;
	}

	@Column(name = "criteresLibelle", length = 100)
	public String getCriteresLibelle() {
		return this.criteresLibelle;
	}

	public void setCriteresLibelle(String criteresLibelle) {
		this.criteresLibelle = criteresLibelle;
	}

	@Column(name = "criteresAbreviation", length = 10)
	public String getCriteresAbreviation() {
		return this.criteresAbreviation;
	}

	public void setCriteresAbreviation(String criteresAbreviation) {
		this.criteresAbreviation = criteresAbreviation;
	}

	@Column(name = "criteresElimination")
	public Boolean getCriteresElimination() {
		return this.criteresElimination;
	}

	public void setCriteresElimination(Boolean criteresElimination) {
		this.criteresElimination = criteresElimination;
	}

	@Column(name = "criteresDescription", length = 65535)
	public String getCriteresDescription() {
		return this.criteresDescription;
	}

	public void setCriteresDescription(String criteresDescription) {
		this.criteresDescription = criteresDescription;
	}
/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "criterestype")
	public Set<Criterescategoriesprojettype> getCriterescategoriesprojettypes() {
		return this.criterescategoriesprojettypes;
	}

	public void setCriterescategoriesprojettypes(
			Set<Criterescategoriesprojettype> criterescategoriesprojettypes) {
		this.criterescategoriesprojettypes = criterescategoriesprojettypes;
	}
*/
/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "criterestype")
	public Set<Criterescahierclausesfinancierestechniquestype> getCriterescahierclausesfinancierestechniquestypes() {
		return this.criterescahierclausesfinancierestechniquestypes;
	}

	public void setCriterescahierclausesfinancierestechniquestypes(
			Set<Criterescahierclausesfinancierestechniquestype> criterescahierclausesfinancierestechniquestypes) {
		this.criterescahierclausesfinancierestechniquestypes = criterescahierclausesfinancierestechniquestypes;
	}
	*/
//	
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "criterestype")
//	public Set<Criterestype> getCriterestypes() {
//		return this.criterestypes;
//	}
//
//	public void setCriterestypes(Set<Criterestype> criterestypes) {
//		this.criterestypes = criterestypes;
//	}

/*
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "criterestype")
	public Set<Criterescahierclausesadministrativestype> getCriterescahierclausesadministrativestypes() {
		return this.criterescahierclausesadministrativestypes;
	}

	public void setCriterescahierclausesadministrativestypes(
			Set<Criterescahierclausesadministrativestype> criterescahierclausesadministrativestypes) {
		this.criterescahierclausesadministrativestypes = criterescahierclausesadministrativestypes;
	}
*/

	@Override
	public String toString() {
		return "Criterestype [criteresId=" + criteresId + ", criterestype=" + criterestype + ", categoriesprojettype="
				+ categoriesprojettype + ", typecriteretype=" + typecriteretype + ", naturecritere=" + naturecritere
				+ ", criteresLibelle=" + criteresLibelle + ", criteresAbreviation=" + criteresAbreviation
				+ ", criteresElimination=" + criteresElimination + ", criteresDescription=" + criteresDescription
				+ ", criterescahierclausesfinancierestechniquestypes=" + criterescahierclausesfinancierestechniquestypes
				+ "]";
	}

	
	
}
