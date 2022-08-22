package tn.dossier.demo.model;

import tn.dossier.demo.entity.Criterescahierclausesfinancierestechniquestype;
import tn.dossier.demo.entity.Operateurs;

public class IntervallesTypeModel {
	private Long intervallesId;
	private Long Ope_operateursId;
	private Long operateursSuperieurId;
    private Long cahierClausesFinancieresTechniquesId;
    private Long criteresId;
	private Float intervallesInferieur;
	private Float intervallesSuperieur;
	private Float intervallesBareme;
	
	public Long getIntervallesId() {
		return intervallesId;
	}
	public void setIntervallesId(Long intervallesId) {
		this.intervallesId = intervallesId;
	}
	public Long getOpe_operateursId() {
		return Ope_operateursId;
	}
	public void setOpe_operateursId(Long ope_operateursId) {
		Ope_operateursId = ope_operateursId;
	}
	public Long getOperateursSuperieurId() {
		return operateursSuperieurId;
	}
	public void setOperateursSuperieurId(Long operateursSuperieurId) {
		this.operateursSuperieurId = operateursSuperieurId;
	}
	public Long getCahierClausesFinancieresTechniquesId() {
		return cahierClausesFinancieresTechniquesId;
	}
	public void setCahierClausesFinancieresTechniquesId(Long cahierClausesFinancieresTechniquesId) {
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
	}
	public Long getCriteresId() {
		return criteresId;
	}
	public void setCriteresId(Long criteresId) {
		this.criteresId = criteresId;
	}
	public Float getIntervallesInferieur() {
		return intervallesInferieur;
	}
	public void setIntervallesInferieur(Float intervallesInferieur) {
		this.intervallesInferieur = intervallesInferieur;
	}
	public Float getIntervallesSuperieur() {
		return intervallesSuperieur;
	}
	public void setIntervallesSuperieur(Float intervallesSuperieur) {
		this.intervallesSuperieur = intervallesSuperieur;
	}
	public Float getIntervallesBareme() {
		return intervallesBareme;
	}
	public void setIntervallesBareme(Float intervallesBareme) {
		this.intervallesBareme = intervallesBareme;
	}
	@Override
	public String toString() {
		return "IntervallesTypeModel [intervallesId=" + intervallesId + ", Ope_operateursId=" + Ope_operateursId
				+ ", operateursSuperieurId=" + operateursSuperieurId + ", cahierClausesFinancieresTechniquesId="
				+ cahierClausesFinancieresTechniquesId + ", criteresId=" + criteresId + ", intervallesInferieur="
				+ intervallesInferieur + ", intervallesSuperieur=" + intervallesSuperieur + ", intervallesBareme="
				+ intervallesBareme + "]";
	}


}
