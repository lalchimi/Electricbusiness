package fr.hb.ElectricBusiness.business;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Data
public class Lieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String adresse;
	private String codePostal;
	private String ville;

	@OneToMany(mappedBy = "lieu")
	private List<Borne> bornes;

	public Lieu(String adresse, String codePostal, String ville, List<Borne> bornes) {
		super();
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.bornes = bornes;
	}

	
}
