package fr.hb.ElectricBusiness.service.implement;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.hb.ElectricBusiness.business.Lieu;
import fr.hb.ElectricBusiness.repository.LieuRepository;
import fr.hb.ElectricBusiness.service.LieuService;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LieuServiceImplement implements LieuService {
	private final LieuRepository lieuRepo;

	@Override
	public Lieu saveLieu(Lieu lieu) {
		return lieuRepo.save(lieu);
	}

	@Override
	public List<Lieu> getLieux() {
		return lieuRepo.findAll();
	}

	@Override
	public Lieu getLieu(Long id) {
		return lieuRepo.findById(id).orElse(null);
	}

	@Override
	public boolean deleteLieu(Long id) {
		Lieu lieu = lieuRepo.findById(id).orElse(null);
		if (lieu == null) {
			return false;
		}
		lieuRepo.delete(lieu);
		return true;
	}
}
