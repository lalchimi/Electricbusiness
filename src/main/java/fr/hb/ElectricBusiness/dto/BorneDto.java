package fr.hb.ElectricBusiness.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

import fr.hb.ElectricBusiness.business.Lieu;

/**
 * DTO for {@link fr.hb.ElectricBusiness.business.Borne}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BorneDto implements Serializable {
	Long id;
	String nom;
	Long puissance;
	Boolean estDisponible;
	String instruction;
	Boolean surPied;
	Long latitude;
	Long longtitude;
	Long prix;
	String photo;
	LieuDto lieu;
}