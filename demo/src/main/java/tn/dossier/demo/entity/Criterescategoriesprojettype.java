package tn.dossier.demo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
@Entity
@Table(name = "criterescategoriesprojettype")
public class Criterescategoriesprojettype {
	
	private static final long serialVersionUID = 9088256550642123356L;
	private CriterescategoriesprojettypeId id;
	private Criterestype criterestype;
	private Categoriesprojet categoriesprojettype;

	public Criterescategoriesprojettype() {
	}

	public Criterescategoriesprojettype(CriterescategoriesprojettypeId id,
			Criterestype criterestype, Categoriesprojet categoriesprojettype) {
		this.id = id;
		this.criterestype = criterestype;
		this.categoriesprojettype = categoriesprojettype;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "criteresId", column = @Column(name = "criteresId", nullable = false)),
			@AttributeOverride(name = "categoriesProjetId", column = @Column(name = "categoriesProjetId", nullable = false)) })
	public CriterescategoriesprojettypeId getId() {
		return this.id;
	}

	public void setId(CriterescategoriesprojettypeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "criteresId", nullable = false, insertable = false, updatable = false)
	public Criterestype getCriterestype() {
		return this.criterestype;
	}

	public void setCriterestype(Criterestype criterestype) {
		this.criterestype = criterestype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriesProjetId", nullable = false, insertable = false, updatable = false)
	public Categoriesprojet getCategoriesprojettype() {
		return this.categoriesprojettype;
	}

	public void setCategoriesprojettype(
			Categoriesprojet categoriesprojettype) {
		this.categoriesprojettype = categoriesprojettype;
	}


}
