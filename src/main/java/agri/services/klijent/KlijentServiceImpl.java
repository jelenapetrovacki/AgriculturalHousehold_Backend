package agri.services.klijent;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import agri.api.klijent.KlijentModel;
import agri.api.klijent.KlijentService;
import agri.persistance.klijent.Klijent;
import agri.persistance.klijent.KlijentRepository;

@CrossOrigin
@RestController
public class KlijentServiceImpl implements KlijentService{

	@Autowired
	private KlijentRepository klijentRepository;
	@Autowired
	private KlijentMapper mapper;
	
	@Override
	public Collection<KlijentModel> getKlijenti() {
		Collection<Klijent> klijenti = klijentRepository.findAll();
		Collection<KlijentModel> klijentiModel = mapper.entityListToApiList(klijenti);
		return klijentiModel;
	}

	@Override
	public KlijentModel createKlijent(KlijentModel body) {
		Klijent klijent = mapper.apiToEntity(body);
		Klijent noviKlijent = klijentRepository.save(klijent);
		return mapper.entityToApi(noviKlijent);
	}

	@Override
	public KlijentModel updateKlijent(KlijentModel body) {
		Klijent klijent = mapper.apiToEntity(body);
		Klijent noviKlijent = klijentRepository.save(klijent);
		return mapper.entityToApi(noviKlijent);
	}

}
