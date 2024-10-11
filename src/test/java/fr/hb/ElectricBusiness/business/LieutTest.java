package fr.hb.ElectricBusiness.business;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class LieutTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String adresse;
	private String codePostal;
	private String ville;

	@OneToMany(mappedBy = "lieu")
	private List<Borne> bornes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Borne> getBornes() {
		return bornes;
	}

	public void setBornes(List<Borne> bornes) {
		this.bornes = bornes;
	}

}
