package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public class naturecritere {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false,columnDefinition = "BIGINT(20)")
	private int natureCritereId;
	@Column(nullable = true,length=50)
	private String natureCritereLibelle;
	@Column(columnDefinition = "TEXT")
	private String natureCritereDescription;
	@Column(nullable = true,length=50)
	private String natureCritereLibelleAr;
	@Column(columnDefinition = "TEXT")
	private String natureCritereDescriptionAr;
	
	
	
	public String getNatureCritereLibelleAr() {
		return natureCritereLibelleAr;
	}



	public void setNatureCritereLibelleAr(String natureCritereLibelleAr) {
		this.natureCritereLibelleAr = natureCritereLibelleAr;
	}



	public String getNatureCritereDescriptionAr() {
		return natureCritereDescriptionAr;
	}



	public void setNatureCritereDescriptionAr(String natureCritereDescriptionAr) {
		this.natureCritereDescriptionAr = natureCritereDescriptionAr;
	}



	public int getNatureCritereId() {
		return natureCritereId;
	}



	public void setNatureCritereId(int natureCritereId) {
		this.natureCritereId = natureCritereId;
	}



	public String getNatureCritereLibelle() {
		return natureCritereLibelle;
	}



	public void setNatureCritereLibelle(String natureCritereLibelle) {
		this.natureCritereLibelle = natureCritereLibelle;
	}



	public String getNatureCritereDescription() {
		return natureCritereDescription;
	}



	public void setNatureCritereDescription(String natureCritereDescription) {
		this.natureCritereDescription = natureCritereDescription;
	}



	@Override
	public String toString() {
		return "naturecritere [natureCritereId=" + natureCritereId + ", natureCritereLibelle=" + natureCritereLibelle
				+ ", natureCritereDescription=" + natureCritereDescription + "]";
	}
	
	

}
