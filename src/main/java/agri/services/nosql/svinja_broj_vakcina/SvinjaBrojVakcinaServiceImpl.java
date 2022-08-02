package agri.services.nosql.svinja_broj_vakcina;

import agri.api.nosql.svinja_broj_vakcina.SvinjaBrojVakcinaModel;
import agri.api.nosql.svinja_broj_vakcina.SvinjaBrojVakcinaService;
import agri.persistance.nosql.svinja_broj_vakcina.SvinjaBrojVakcinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class SvinjaBrojVakcinaServiceImpl implements SvinjaBrojVakcinaService {
    @Autowired
    private SvinjaBrojVakcinaMapper mapper;
    @Autowired
    private SvinjaBrojVakcinaRepository svinjaBrojVakcinaRepository;
    @Override
    public SvinjaBrojVakcinaModel getBrojVakcina(String tetovir_broj_svinje) {
        return mapper.entityToApi(svinjaBrojVakcinaRepository.findOneByTetovirBrojSvinje(tetovir_broj_svinje));
    }
}
