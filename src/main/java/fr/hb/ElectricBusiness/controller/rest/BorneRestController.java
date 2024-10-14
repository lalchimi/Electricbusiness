package fr.hb.ElectricBusiness.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.hb.ElectricBusiness.business.Borne;
import fr.hb.ElectricBusiness.service.BorneService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/bornes")
@AllArgsConstructor
public class BorneRestController {

    private BorneService borneService;

    @GetMapping("")
    public List<Borne> getBornes() {
        return borneService.getBornes();
    }

    @PostMapping("")
    public Borne postBorne(@RequestBody Borne borne) {
        return borneService.saveBorne(borne);
    }
}
