package fr.hb.ElectricBusiness.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.service.LieuService;

public class LieuRestController {
    private LieuService lieuService;

    @GetMapping("")
    public List<Lieu> getLieux() {
        return lieuService.getLieux();
    }

    @PostMapping("")
    public Lieu saveLieu(@RequestBody Lieu lieu) {
        return lieuService.saveLieu(lieu);
    }
    
	@GetMapping("/{id}")
	public Lieu getLieu(@PathVariable Long id) {
	  return lieuService.getLieu(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLieu(@PathVariable Long id) {
		lieuService.deleteLieu(id);
	}
}
