package fr.hb.ElectricBusiness.data;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.hb.ElectricBusiness.business.Borne;
import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.business.Reservation;
import fr.hb.ElectricBusiness.business.Utilisateur;
import fr.hb.ElectricBusiness.repository.BorneRepository;
import fr.hb.ElectricBusiness.repository.LieuRepository;
import fr.hb.ElectricBusiness.repository.ReservationRepository;
import fr.hb.ElectricBusiness.repository.UtilisateurRepository;
import jakarta.annotation.PostConstruct;

@Component
public class Data {

	@Autowired
	private BorneRepository borneRepo;
	@Autowired
	private LieuRepository lieuRepo;
	@Autowired
	private ReservationRepository reservationRepo;
	@Autowired
	private UtilisateurRepository utilisateurRepo;

	public void insertData() {

		Lieu lieuTest = new Lieu("rue du test", "69 420", "TestTown", null);
		/*Reservation reservationTest = new Reservation(LocalDate.of(2000, 01, 01), LocalDate.of(2001, 12, 12), null,
				null);
		Utilisateur utilisateurTest = new Utilisateur("DOE", "Jane", "JaneDoe@test.com", "password",
				"06.06.06.06.06.06", "user", LocalDate.of(1980, 05, 10), 20, "rue de test", 694420, "TestTown", null);*/
		Borne borneTest = new Borne("borneTest", 40, true, "This is a test", false, 4, 2, 3, "fennec.png",
				null, lieuTest);

	/*	reservationTest.setUtilisateur(utilisateurTest);
		reservationTest.setBorne(borneTest); */
		
		
		lieuRepo.save(lieuTest);
		borneRepo.save(borneTest);
		
		/*reservationRepo.save(reservationTest);
		utilisateurRepo.save(utilisateurTest);*/
	
	}
}
