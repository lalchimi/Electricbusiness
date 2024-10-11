package fr.hb.ElectricBusiness.controller;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class LieuTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String adresse;
	private String codePostal;
	private String ville;

	@OneToMany(mappedBy = "lieu")
	private List<BorneTest> bornes;

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

	public List<BorneTest> getBornes() {
		return bornes;
	}

	public void setBornes(List<BorneTest> bornes) {
		this.bornes = bornes;
	}

}
