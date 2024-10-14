package fr.hb.ElectricBusiness.dto;

import java.io.Serializable;

import fr.hb.ElectricBusiness.business.Borne;
import lombok.Value;

@Value
public class ReservationDto implements Serializable {
	/**
	 * DTO for {@link fr.hb.ElectricBusiness.business.Reservation}
	 */
	Long id;
	Borne borne;
}
