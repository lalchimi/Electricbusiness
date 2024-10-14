package fr.hb.ElectricBusiness.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.hb.ElectricBusiness.business.Lieu;

@Service
public interface LieuService {

	Lieu saveLieu(Lieu lieu);

	Lieu getLieu(Long id);

	boolean deleteLieu(Long id);

	List<Lieu> getLieux();

}
