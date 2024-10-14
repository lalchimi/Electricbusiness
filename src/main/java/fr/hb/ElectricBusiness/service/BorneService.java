package fr.hb.ElectricBusiness.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import fr.hb.ElectricBusiness.business.Borne;

@Service
public interface BorneService {

	Borne saveBorne(Borne borne);

	List<Borne> getBornes();

	boolean deleteBorne(Long id);

	public Borne getBorne(Long id);

}
