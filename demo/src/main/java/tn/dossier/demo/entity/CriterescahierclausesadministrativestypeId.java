package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CriterescahierclausesadministrativestypeId  implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long cahierClausesAdministrativesId;
	private long criteresId;

	public CriterescahierclausesadministrativestypeId() {
	}

	public CriterescahierclausesadministrativestypeId(
			long cahierClausesAdministrativesId, long criteresId) {
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
		this.criteresId = criteresId;
	}

	@Column(name = "cahierClausesAdministrativesId", nullable = false)
	public long getCahierClausesAdministrativesId() {
		return this.cahierClausesAdministrativesId;
	}

	public void setCahierClausesAdministrativesId(
			long cahierClausesAdministrativesId) {
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
	}

	@Column(name = "criteresId", nullable = false)
	public long getCriteresId() {
		return this.criteresId;
	}

	public void setCriteresId(long criteresId) {
		this.criteresId = criteresId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CriterescahierclausesadministrativestypeId))
			return false;
		CriterescahierclausesadministrativestypeId castOther = (CriterescahierclausesadministrativestypeId) other;

		return (this.getCahierClausesAdministrativesId() == castOther
				.getCahierClausesAdministrativesId())
				&& (this.getCriteresId() == castOther.getCriteresId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getCahierClausesAdministrativesId();
		result = 37 * result + (int) this.getCriteresId();
		return result;
	}


}
