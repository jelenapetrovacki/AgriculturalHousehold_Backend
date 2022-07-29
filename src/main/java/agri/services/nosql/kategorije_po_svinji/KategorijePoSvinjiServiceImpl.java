package agri.services.nosql.kategorije_po_svinji;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import agri.api.nosql.kategorije_po_svinji.KategorijePoSvinjiModel;
import agri.api.nosql.kategorije_po_svinji.KategorijePoSvinjiService;
import agri.persistance.nosql.kategorije_po_svinji.KategorijePoSvinjiRepository;

@CrossOrigin
@RestController
public class KategorijePoSvinjiServiceImpl implements KategorijePoSvinjiService {

	@Autowired
	private KategorijePoSvinjiRepository kategorijeRepository; 
	
	@Autowired
	private KategorijePoSvinjiMapper mapper;
	
	@Override
	public Collection<KategorijePoSvinjiModel> getKategorije(String tetovir_broj_svinje) {
		return mapper.entityListToApiList(kategorijeRepository.findAllByTetovirBrojSvinje(tetovir_broj_svinje));
	}

}
