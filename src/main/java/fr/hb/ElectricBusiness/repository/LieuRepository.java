package fr.hb.ElectricBusiness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.hb.ElectricBusiness.business.Lieu;

@Repository
public interface LieuRepository extends JpaRepository < Lieu, Long>{

}
