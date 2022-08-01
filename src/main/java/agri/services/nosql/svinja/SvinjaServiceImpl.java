package agri.services.nosql.svinja;

import agri.api.nosql.svinja.SvinjaModel;
import agri.api.nosql.svinja.SvinjaService;
import agri.persistance.nosql.svinja.SvinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class SvinjaServiceImpl implements SvinjaService {

    @Autowired
    private SvinjaRepository svinjaRepository;

    @Autowired
    private SvinjaMapper mapper;

    @Override
    public Collection<SvinjaModel> getSvinje() {
        return mapper.entityListToApiList(svinjaRepository.findAll());
    }
}
