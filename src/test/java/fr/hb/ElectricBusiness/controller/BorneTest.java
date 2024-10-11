package fr.hb.ElectricBusiness.controller;

import fr.hb.ElectricBusiness.business.LieutTest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BorneTest {
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
	private UtilisateurTest utilisateur;

	@ManyToOne
	private LieutTest lieu;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public long getPuissance() {
		return puissance;
	}

	public void setPuissance(long puissance) {
		this.puissance = puissance;
	}

	public Boolean getEstDisponible() {
		return estDisponible;
	}

	public void setEstDisponible(Boolean estDisponible) {
		this.estDisponible = estDisponible;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public Boolean getSurPied() {
		return surPied;
	}

	public void setSurPied(Boolean surPied) {
		this.surPied = surPied;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public long getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(long longtitude) {
		this.longtitude = longtitude;
	}

	public long getPrix() {
		return prix;
	}

	public void setPrix(long prix) {
		this.prix = prix;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public UtilisateurTest getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(UtilisateurTest utilisateur) {
		this.utilisateur = utilisateur;
	}

	public LieutTest getLieu() {
		return lieu;
	}

	public void setLieu(LieutTest lieu) {
		this.lieu = lieu;
	}

}
