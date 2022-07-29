package agri.services.nosql.leglo;

import agri.api.nosql.leglo.LegloModel;
import agri.api.nosql.leglo.LegloService;
import agri.persistance.nosql.leglo.Leglo;
import agri.persistance.nosql.leglo.LegloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class LegloServiceImpl implements LegloService {

    @Autowired
    private LegloRepository legloRepository;

    @Autowired
    private LegloMapper mapper;

    @Override
    public LegloModel getLeglo(String oznaka_legla) {
        return mapper.entityToApi(legloRepository.findOneByOznakalegla(oznaka_legla));
    }

}

