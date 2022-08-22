package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.FetchType;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "criteres")
public class Criteres implements java.io.Serializable {
	private static final long serialVersionUID = 1889491417017370307L;
	private Long criteresId;
	private Criteres criteres;
	private TypeCritere typecritere;
	private Naturecritere naturecritere;
	private String criteresLibelle;
	private String criteresAbreviation;
	private Boolean criteresElimination;
	private String criteresDescription;
	private Categoriesprojet categoriesprojet;
//	private Set<Criterescategoriesprojet> criterescategoriesprojets = new HashSet<Criterescategoriesprojet>(
//			0);
//	private Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses = new HashSet<Criterescahierclausesadministratives>(
//			0);
//	private Set<Criterescahierclausesfinancierestechniques> criterescahierclausesfinancierestechniqueses = new HashSet<Criterescahierclausesfinancierestechniques>(
//			0);
//	private Set<Criteres> critereses = new HashSet<Criteres>(0);

	public Criteres() {
	}

	public Criteres(
			Criteres criteres,
			TypeCritere typecritere,
			Naturecritere naturecritere,
			String criteresLibelle,
			String criteresAbreviation,
			Boolean criteresElimination,
			String criteresDescription,
			Categoriesprojet categorieProjet) {
		this.criteres = criteres;
		this.typecritere = typecritere;
		this.naturecritere = naturecritere;
		this.criteresLibelle = criteresLibelle;
		this.categoriesprojet=categorieProjet;
		this.criteresAbreviation = criteresAbreviation;
		this.criteresElimination = criteresElimination;
		this.criteresDescription = criteresDescription;
//		this.criterescategoriesprojets = criterescategoriesprojets;
//		this.criterescahierclausesadministrativeses = criterescahierclausesadministrativeses;
//		this.criterescahierclausesfinancierestechniqueses = criterescahierclausesfinancierestechniqueses;
//		this.critereses = critereses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "criteresId", unique = true, nullable = false)
	public Long getCriteresId() {
		return this.criteresId;
	}

	public void setCriteresId(Long criteresId) {
		this.criteresId = criteresId;
	}
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Cri_criteresId")
	public Criteres getCriteres() {
		return this.criteres;
	}

	public void setCriteres(Criteres criteres) {
		this.criteres = criteres;
	}


@ManyToOne
	@JoinColumn(name = "typeCritereId")

	public TypeCritere getTypecritere() {
		return typecritere;
	}

	public void setTypecritere(TypeCritere typecritere) {
		this.typecritere = typecritere;
	}

	@ManyToOne
	@JoinColumn(name = "natureCritereId")
	public Naturecritere getNaturecritere() {
		return this.naturecritere;
	}

	public void setNaturecritere(Naturecritere naturecritere) {
		this.naturecritere = naturecritere;
	}
	@ManyToOne
	@JoinColumn(name = "categoriesProjetId")
	public Categoriesprojet getCategoriesprojet() {
		return this.categoriesprojet;
	}

	public void setCategoriesprojet(
			Categoriesprojet categoriesprojet) {
		this.categoriesprojet = categoriesprojet;
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
//
//	@OneToMany( mappedBy = "criteres")
//	public Set<Criterescategoriesprojet> getCriterescategoriesprojets() {
//		return this.criterescategoriesprojets;
//	}
//
//	public void setCriterescategoriesprojets(
//			Set<Criterescategoriesprojet> criterescategoriesprojets) {
//		this.criterescategoriesprojets = criterescategoriesprojets;
//	}
//
//	@OneToMany( mappedBy = "criteres")
//	public Set<Criterescahierclausesadministratives> getCriterescahierclausesadministrativeses() {
//		return this.criterescahierclausesadministrativeses;
//	}
//
//	public void setCriterescahierclausesadministrativeses(
//			Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses) {
//		this.criterescahierclausesadministrativeses = criterescahierclausesadministrativeses;
//	}
//
//	@OneToMany( mappedBy = "criteres")
//	public Set<Criterescahierclausesfinancierestechniques> getCriterescahierclausesfinancierestechniqueses() {
//		return this.criterescahierclausesfinancierestechniqueses;
//	}
//
//	public void setCriterescahierclausesfinancierestechniqueses(
//			Set<Criterescahierclausesfinancierestechniques> criterescahierclausesfinancierestechniqueses) {
//		this.criterescahierclausesfinancierestechniqueses = criterescahierclausesfinancierestechniqueses;
//	}
//
//	@OneToMany( mappedBy = "criteres")
//	public Set<Criteres> getCritereses() {
//		return this.critereses;
//	}
//
//	public void setCritereses(Set<Criteres> critereses) {
//		this.critereses = critereses;
//	}


}
