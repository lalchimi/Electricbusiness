package fr.hb.ElectricBusiness.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

/**
 * DTO for {@link fr.hb.ElectricBusiness.business.Lieu}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LieuDto implements Serializable {
	Long id;
	String adresse;
	String codePostal;
	String ville;
}
