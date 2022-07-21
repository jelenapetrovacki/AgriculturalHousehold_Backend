package agri.services.svrha;

import agri.api.svrha.SvrhaModel;
import agri.api.svrha.SvrhaService;
import agri.persistance.svrha.Svrha;
import agri.persistance.svrha.SvrhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
public class SvrhaServiceImpl implements SvrhaService {

    @Autowired
    private SvrhaRepository svrhaRepository;

    @Autowired
    private SvrhaMapper mapper;

    @Override
    public Collection<SvrhaModel> getSvrhe() {
        Collection<Svrha> svrhe = svrhaRepository.findAll();
        Collection<SvrhaModel> svrheModel = mapper.entityListToApiList(svrhe);
        return svrheModel;
    }
}
