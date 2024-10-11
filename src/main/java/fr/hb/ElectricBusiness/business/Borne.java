package fr.hb.ElectricBusiness.business;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Borne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private long puissance;
	private Boolean estDisponible;
	private String instruction;
	private Boolean surPied;
	private long latitude;
	private long longtitude;
	private long prix;
	private String photo;

	@ManyToOne
	private Utilisateur utilisateur;

	@ManyToOne
	private Lieu lieu;

	public Borne(String nom, long puissance, Boolean estDisponible, String instruction, Boolean surPied, long latitude,
			long longtitude, long prix, String photo, Utilisateur utilisateur, Lieu lieu) {
		super();
		this.nom = nom;
		this.puissance = puissance;
		this.estDisponible = estDisponible;
		this.instruction = instruction;
		this.surPied = surPied;
		this.latitude = latitude;
		this.longtitude = longtitude;
		this.prix = prix;
		this.photo = photo;
		this.utilisateur = utilisateur;
		this.lieu = lieu;
	}
}
