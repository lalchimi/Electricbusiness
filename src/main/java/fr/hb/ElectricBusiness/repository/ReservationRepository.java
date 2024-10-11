package fr.hb.ElectricBusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hb.ElectricBusiness.business.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
