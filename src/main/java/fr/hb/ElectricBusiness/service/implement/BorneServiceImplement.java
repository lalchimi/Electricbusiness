package fr.hb.ElectricBusiness.service.implement;


import java.util.List;

import org.springframework.stereotype.Service;

import fr.hb.ElectricBusiness.business.Borne;
import fr.hb.ElectricBusiness.repository.BorneRepository;
import fr.hb.ElectricBusiness.service.BorneService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BorneServiceImplement implements BorneService {

	private final BorneRepository borneRepo;
	
	@Override
	public Borne saveBorne(Borne borne) {
		return borneRepo.save(borne);
	}
	
	@Override
	public List<Borne> getBornes() {
		return borneRepo.findAll();
	}
	
	@Override 
	public Borne getBorne(Long id) {
		return borneRepo.findById(id).orElse(null);
	}
	
	@Override
	public boolean deleteBorne(Long id) {
		Borne borne = borneRepo.findById(id).orElse(null);
		if (borne == null) {
			return false;
		}
		borneRepo.delete(borne);
		return true;
	}
}
