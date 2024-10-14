package fr.hb.ElectricBusiness.controller;

import java.util.List;
import java.util.Optional;

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
import fr.hb.ElectricBusiness.service.BorneService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@Validated
@RequestMapping("api/borne")
public class BorneController {
	
	private BorneService borneService;
	
	@GetMapping("")
	public List<Borne> getBornes() {
	  return borneService.getBornes();	
	}
	
	@GetMapping("/{id}")
	public Borne getBorne(@PathVariable Long id) {
	  return borneService.getBorne(id);
	}
	
	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Borne saveBorne (@RequestBody Borne borne) {
		return borneService.saveBorne(borne);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteBorne(@PathVariable Long id) {
		borneService.deleteBorne(id);
	}
}
