package fr.hb.ElectricBusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.hb.ElectricBusiness.data.Data;

@SpringBootApplication
public class ElectricBusinessApplication {
	

	public static void main(String[] args) {
		Data data = new Data();
		SpringApplication.run(ElectricBusinessApplication.class, args);
		data.insertData();
	}

}
