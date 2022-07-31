package agri.services.nosql.terapije_po_danu;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import agri.api.nosql.terapije_po_danu.TerapijePoDanuModel;
import agri.api.nosql.terapije_po_danu.TerapijePoDanuService;
import agri.persistance.nosql.terapije_po_danu.TerapijePoDanuRepository;

@RestController
@CrossOrigin
public class TerapijePoDanuServiceImpl implements TerapijePoDanuService {

	@Autowired
	private TerapijePoDanuRepository terapijeRepository;
	
	@Autowired
	private TerapijePoDanuMapper mapper; 
	
	@Override
	public Collection<TerapijePoDanuModel> getTerapijePoDanu() {
		LocalDate danasnji_dan = LocalDate.now();
		Integer god = danasnji_dan.getYear();
		return mapper.entityListToApiList(terapijeRepository.findByGodinaAndDatumDoGreaterThanEqual(god, danasnji_dan));
	}

}
