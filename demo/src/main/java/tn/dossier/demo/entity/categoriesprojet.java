package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})

public class categoriesprojet {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(nullable = false,columnDefinition = "BIGINT(20)")
	private int categoriesProjetId;
	@Column(nullable = true,length=50)
	private String categoriesProjetLibelle;
	@Column(columnDefinition = "TEXT")
	private String categoriesProjetDescription;
	public int getCategoriesProjetId() {
		return categoriesProjetId;
	}
	public void setCategoriesProjetId(int categoriesProjetId) {
		this.categoriesProjetId = categoriesProjetId;
	}
	public String getCategoriesProjetLibelle() {
		return categoriesProjetLibelle;
	}
	public void setCategoriesProjetLibelle(String categoriesProjetLibelle) {
		this.categoriesProjetLibelle = categoriesProjetLibelle;
	}
	public String getCategoriesProjetDescription() {
		return categoriesProjetDescription;
	}
	public void setCategoriesProjetDescription(String categoriesProjetDescription) {
		this.categoriesProjetDescription = categoriesProjetDescription;
	}
	@Override
	public String toString() {
		return "categoriesprojet [categoriesProjetId=" + categoriesProjetId + ", categoriesProjetLibelle="
				+ categoriesProjetLibelle + ", categoriesProjetDescription=" + categoriesProjetDescription + "]";
	}
	
	
	
	
	


}
