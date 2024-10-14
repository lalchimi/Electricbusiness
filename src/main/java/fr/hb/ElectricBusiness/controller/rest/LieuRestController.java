package fr.hb.ElectricBusiness.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
    public Lieu postBorne(@RequestBody Lieu lieu) {
        return lieuService.saveLieu(lieu);
    }
}
