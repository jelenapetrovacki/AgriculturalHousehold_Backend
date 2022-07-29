package agri.services.nosql.veterinarski_broj_po_svinji;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import agri.api.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinjiService;
import agri.api.nosql.veterinarski_broj_po_svinji.VetrinarskiBrojPoSvinjiModel;
import agri.persistance.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinjiRepository;

@RestController
@CrossOrigin
public class VeterinarskiBrojPoSvinjiServiceImpl implements VeterinarskiBrojPoSvinjiService{

	@Autowired
    private VeterinarskiBrojPoSvinjiRepository veterinarskiBrojPoSvinjiRepository;

    @Autowired
    private VeterinarskiBrojPoSvinjiMapper mapper;

	@Override
	public Collection<VetrinarskiBrojPoSvinjiModel> getArhivaVeterinarskogBroja(String tetovir_broj_svinje) {
		return mapper.entityListToApiList(veterinarskiBrojPoSvinjiRepository.findAllByTetovirBrojSvinje(tetovir_broj_svinje));
	}
    
}
