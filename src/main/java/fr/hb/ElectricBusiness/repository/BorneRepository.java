package fr.hb.ElectricBusiness.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hb.ElectricBusiness.business.Borne;

@Repository
@Configuration
public interface BorneRepository extends JpaRepository <Borne, Long> {
	
}
