package fr.hb.ElectricBusiness.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.hb.ElectricBusiness.business.Borne;
import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.service.BorneService;
import fr.hb.ElectricBusiness.service.LieuService;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Data implements CommandLineRunner {

	private BorneService borneService; 
	private LieuService lieuService;
	
    @Override
    public void run(String... args) throws Exception {
    	lieuService.saveLieu(new Lieu("rue du test", "69 420", "TestTown", null)) ;
        borneService.saveBorne(new Borne("borneTest", 40, true, "This is a test", false, 4, 2, 3, "fennec.png",
				null, lieuService.getLieu(1L)));
    }
}
