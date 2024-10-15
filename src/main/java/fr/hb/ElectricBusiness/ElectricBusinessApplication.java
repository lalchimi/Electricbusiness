package fr.hb.ElectricBusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ElectricBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricBusinessApplication.class, args);
	}

}
