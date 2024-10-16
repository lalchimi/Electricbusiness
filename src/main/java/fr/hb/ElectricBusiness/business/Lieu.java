package fr.hb.ElectricBusiness.business;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class Lieu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	

	private String adresse;
	private String codePostal;
	private String ville;

	@JsonIgnore
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
