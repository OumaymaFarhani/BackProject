package tn.dossier.demo.entity;

import java.util.HashSet;
import java.util.Set;

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

@Entity
@Table(name = "cahierchargestype")
public class Cahierchargestype implements java.io.Serializable {
	
	private static final long serialVersionUID = 4056232814339947855L;
	private Long cahierChargesId;
	private Categoriesprojet categoriesprojettype;
	private String cahierChargesLibelle;
	private String cahierChargesDescription;
//	private Set<Cahierclausesfinancierestechniquestype> cahierclausesfinancierestechniquestypes = new HashSet<Cahierclausesfinancierestechniquestype>(
//			0);
//	private Set<Cahierclausesadministrativestype> cahierclausesadministrativestypes = new HashSet<Cahierclausesadministrativestype>(
//			0);

	public Cahierchargestype() {
	}

	public Cahierchargestype(
			Categoriesprojet categoriesprojettype,
			String cahierChargesLibelle,
			String cahierChargesDescription) {
		this.categoriesprojettype = categoriesprojettype;
		this.cahierChargesLibelle = cahierChargesLibelle;
		this.cahierChargesDescription = cahierChargesDescription;
//		this.cahierclausesfinancierestechniquestypes = cahierclausesfinancierestechniquestypes;
//		this.cahierclausesadministrativestypes = cahierclausesadministrativestypes;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "cahierChargesId", unique = true, nullable = false)
	public Long getCahierChargesId() {
		return this.cahierChargesId;
	}

	public void setCahierChargesId(Long cahierChargesId) {
		this.cahierChargesId = cahierChargesId;
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

	@Column(name = "cahierChargesLibelle", length = 100)
	public String getCahierChargesLibelle() {
		return this.cahierChargesLibelle;
	}

	public void setCahierChargesLibelle(String cahierChargesLibelle) {
		this.cahierChargesLibelle = cahierChargesLibelle;
	}

	@Column(name = "cahierChargesDescription", length = 65535)
	public String getCahierChargesDescription() {
		return this.cahierChargesDescription;
	}

	public void setCahierChargesDescription(String cahierChargesDescription) {
		this.cahierChargesDescription = cahierChargesDescription;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierchargestype")
//	public Set<Cahierclausesfinancierestechniquestype> getCahierclausesfinancierestechniquestypes() {
//		return this.cahierclausesfinancierestechniquestypes;
//	}
//
//	public void setCahierclausesfinancierestechniquestypes(
//			Set<Cahierclausesfinancierestechniquestype> cahierclausesfinancierestechniquestypes) {
//		this.cahierclausesfinancierestechniquestypes = cahierclausesfinancierestechniquestypes;
//	}
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierchargestype")
//	public Set<Cahierclausesadministrativestype> getCahierclausesadministrativestypes() {
//		return this.cahierclausesadministrativestypes;
//	}
//
//	public void setCahierclausesadministrativestypes(
//			Set<Cahierclausesadministrativestype> cahierclausesadministrativestypes) {
//		this.cahierclausesadministrativestypes = cahierclausesadministrativestypes;
//	}

}
