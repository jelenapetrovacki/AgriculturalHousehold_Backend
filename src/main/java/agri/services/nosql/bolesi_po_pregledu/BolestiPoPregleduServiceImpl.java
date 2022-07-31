package agri.services.nosql.bolesi_po_pregledu;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;
import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduService;
import agri.persistance.nosql.bolesti_po_pregledu.BolestiPoPregleduRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class BolestiPoPregleduServiceImpl implements BolestiPoPregleduService {

    @Autowired
    private BolestiPoPregleduMapper mapper;

    @Autowired
    private BolestiPoPregleduRepository bolestiPoPregleduRepository;
    @Override
    public Collection<BolestiPoPregleduModel> getBolesti(int sifra_pregleda) {
        return mapper.entityListToApiList(bolestiPoPregleduRepository.findAllBySifraPregleda(sifra_pregleda));
    }
}
