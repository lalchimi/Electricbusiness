package fr.hb.ElectricBusiness.business;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private String telephone;
	private String role;
	private LocalDate dateDeNaissance;
	private long numero;
	private String adresse;
	private int codePostal;
	private String Ville;

	@OneToMany(mappedBy = "utilisateur")
	private List<Borne> bornes;

	public Utilisateur(String nom, String prenom, String email, String motDePasse, String telephone, String role,
			LocalDate dateDeNaissance, long numero, String adresse, int codePostal, String ville, List<Borne> bornes) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.telephone = telephone;
		this.role = role;
		this.dateDeNaissance = dateDeNaissance;
		this.numero = numero;
		this.adresse = adresse;
		this.codePostal = codePostal;
		Ville = ville;
		this.bornes = bornes;
	}
	
	
}
