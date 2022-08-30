package tn.dossier.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Table(name = "categoriesprojet")
public class Categoriesprojet implements java.io.Serializable{
	private static final long serialVersionUID = 6630840835358775645L;

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
	
	
	
	public Categoriesprojet() {
		super();
	}
	public Categoriesprojet(int categoriesProjetId, String categoriesProjetLibelle,
			String categoriesProjetDescription) {
		super();
		this.categoriesProjetId = categoriesProjetId;
		this.categoriesProjetLibelle = categoriesProjetLibelle;
		this.categoriesProjetDescription = categoriesProjetDescription;
	}
	@Override
	public String toString() {
		return "categoriesprojet [categoriesProjetId=" + categoriesProjetId + ", categoriesProjetLibelle="
				+ categoriesProjetLibelle + ", categoriesProjetDescription=" + categoriesProjetDescription + "]";
	}
	
	
	
	
	


}
