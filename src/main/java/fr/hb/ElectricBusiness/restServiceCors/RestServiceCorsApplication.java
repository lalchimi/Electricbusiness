package fr.hb.ElectricBusiness.restServiceCors;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class RestServiceCorsApplication {
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("api/bornes").allowedOrigins("http://localhost:5506");
			}
		};
	}
}
