package agri.services.uplata;

import agri.api.uplata.UplataModel;
import agri.api.uplata.UplataService;
import agri.persistance.uplata.Uplata;
import agri.persistance.uplata.UplataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UplataServiceImpl implements UplataService {

    @Autowired
    private UplataRepository uplataRepository;
    @Autowired
    private UplataMapper mapper;

    @Override
    public UplataModel getUplataByFakturaID(int fakturaId) {
        Uplata uplata = uplataRepository.findByFakturaId(fakturaId);
        UplataModel uplataModel = mapper.entityToApi(uplata);
        return uplataModel;
    }

    @Override
    public UplataModel createUplata(UplataModel body) {
        Uplata uplata = mapper.apiToEntity(body);
        Uplata novaUplata = uplataRepository.save(uplata);
        return mapper.entityToApi(novaUplata);
    }

    @Override
    public void deleteUplata(int uplataId) {
       uplataRepository.deleteById(uplataId);
    }
}
