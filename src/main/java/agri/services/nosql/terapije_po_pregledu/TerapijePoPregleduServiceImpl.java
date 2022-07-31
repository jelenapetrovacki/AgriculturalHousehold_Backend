package agri.services.nosql.terapije_po_pregledu;

import agri.api.nosql.terapije_po_pregledu.TerapijePoPregleduModel;
import agri.api.nosql.terapije_po_pregledu.TerapijePoPregleduService;
import agri.persistance.nosql.terapije_po_pregledu.TerapijePoPregleduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class TerapijePoPregleduServiceImpl implements TerapijePoPregleduService {
    @Autowired
    private TerapijePoPregleduMapper mapper;

    @Autowired
    private TerapijePoPregleduRepository terapijePoPregleduRepository;

    @Override
    public Collection<TerapijePoPregleduModel> getTerapije(int sifra_pregleda) {
        return mapper.entityListToApiList(terapijePoPregleduRepository.findAllBySifraPregleda(sifra_pregleda));
    }
}
