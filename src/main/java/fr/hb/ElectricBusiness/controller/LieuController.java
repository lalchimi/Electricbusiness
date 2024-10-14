package fr.hb.ElectricBusiness.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.hb.ElectricBusiness.business.Borne;
import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.service.BorneService;
import fr.hb.ElectricBusiness.service.LieuService;
import lombok.AllArgsConstructor;


@RestController
@Validated
@AllArgsConstructor
@RequestMapping("api/lieu")
public class LieuController {
	
	private LieuService lieuService;
	
	@GetMapping("")
	public List<Lieu> getLieux() {
	  return lieuService.getLieux();	
	}
	
	@GetMapping("/{id}")
	public Lieu getLieu(@PathVariable Long id) {
	  return lieuService.getLieu(id);
	}
	
	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Lieu saveLieu (@RequestBody Lieu lieu) {
		return lieuService.saveLieu(lieu);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteLieu(@PathVariable Long id) {
		lieuService.deleteLieu(id);
	}
}
