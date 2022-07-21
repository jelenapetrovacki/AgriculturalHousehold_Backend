package agri.services.narudzbina;

import agri.api.narudzbina.NarudzbinaModel;
import agri.api.narudzbina.NarudzbinaService;
import agri.persistance.narudzbina.Narudzbina;
import agri.persistance.narudzbina.NarudzbinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
public class NarudzbinaServiceImpl implements NarudzbinaService {

    @Autowired
    private NarudzbinaRepository narudzbinaRepository;

    @Autowired
    private NarudzbinaMapper mapper;

    @Override
    public Collection<NarudzbinaModel> getNarudzbine() {
        Collection<Narudzbina> narudzbine = narudzbinaRepository.findAll();
        Collection<NarudzbinaModel> narudzbineModel = mapper.entityListToApiList(narudzbine);
        return narudzbineModel;
    }

    @Override
    public NarudzbinaModel createNarudzbina(NarudzbinaModel body) {
        Narudzbina narudzbina = mapper.apiToEntity(body);
        Narudzbina novaNarudzbina = narudzbinaRepository.save(narudzbina);
        return mapper.entityToApi(novaNarudzbina);
    }

    @Override
    public NarudzbinaModel updateNarudzbina(NarudzbinaModel body) {
        return createNarudzbina(body);
    }

    @Override
    public void deleteNarudzbina(int narudzbinaId) {
        narudzbinaRepository.deleteById(narudzbinaId);
    }
}
