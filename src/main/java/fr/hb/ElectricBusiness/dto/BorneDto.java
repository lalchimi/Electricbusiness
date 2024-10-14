package fr.hb.ElectricBusiness.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link fr.hb.ElectricBusiness.business.Borne}
 */
@Value
public class BorneDto implements Serializable {
	long id;
	String nom;
	long puissance;
	Boolean estDisponible;
	String instruction;
	Boolean surPied;
	long latitude;
	long longtitude;
	long prix;
	String photo;
}