package fr.hb.ElectricBusiness.business;

import java.sql.Time;
import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	@ManyToOne
    private Utilisateur utilisateur;

    @ManyToOne
    private Borne borne;

	public Reservation(LocalDate dateDebut, LocalDate dateFin, Utilisateur utilisateur,
			Borne borne) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.utilisateur = utilisateur;
		this.borne = borne;
	}
    
    
}
