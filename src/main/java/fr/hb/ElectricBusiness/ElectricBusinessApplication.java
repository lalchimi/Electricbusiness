package fr.hb.ElectricBusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.controller.BorneController;
import fr.hb.ElectricBusiness.controller.LieuController;
import fr.hb.ElectricBusiness.data.Data;

@SpringBootApplication
public class ElectricBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricBusinessApplication.class, args);
	}

}
