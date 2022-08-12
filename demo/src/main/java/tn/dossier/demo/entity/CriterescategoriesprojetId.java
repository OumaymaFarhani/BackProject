package tn.dossier.demo.entity;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class CriterescategoriesprojetId implements java.io.Serializable {
	private static final long serialVersionUID = 2247829873983822350L;
	private long criteresId;
	private long categoriesProjetId;

	public CriterescategoriesprojetId() {
	}

	public CriterescategoriesprojetId(long criteresId, long categoriesProjetId) {
		this.criteresId = criteresId;
		this.categoriesProjetId = categoriesProjetId;
	}

	@Column(name = "criteresId", nullable = false)
	public long getCriteresId() {
		return this.criteresId;
	}

	public void setCriteresId(long criteresId) {
		this.criteresId = criteresId;
	}

	@Column(name = "categoriesProjetId", nullable = false)
	public long getCategoriesProjetId() {
		return this.categoriesProjetId;
	}

	public void setCategoriesProjetId(long categoriesProjetId) {
		this.categoriesProjetId = categoriesProjetId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CriterescategoriesprojetId))
			return false;
		CriterescategoriesprojetId castOther = (CriterescategoriesprojetId) other;

		return (this.getCriteresId() == castOther.getCriteresId())
				&& (this.getCategoriesProjetId() == castOther
						.getCategoriesProjetId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCriteresId();
		result = 37 * result + (int) this.getCategoriesProjetId();
		return result;
	}


}
