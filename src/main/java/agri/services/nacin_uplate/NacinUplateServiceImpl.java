package agri.services.nacin_uplate;

import agri.api.nacin_uplate.NacinUplateModel;
import agri.api.nacin_uplate.NacinUplateService;
import agri.api.svrha.SvrhaModel;
import agri.persistance.nacin_uplate.NacinUplate;
import agri.persistance.nacin_uplate.NacinUplateRepository;
import agri.persistance.svrha.Svrha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
@CrossOrigin
@RestController
public class NacinUplateServiceImpl implements NacinUplateService {
    @Autowired
    private NacinUplateRepository nacinUplateRepository;
    @Autowired
    private NacinUplateMapper mapper;

    @Override
    public Collection<NacinUplateModel> getNaciniUplate() {
        Collection<NacinUplate> naciniUplate = nacinUplateRepository.findAll();
        Collection<NacinUplateModel> naciniUplateModel = mapper.entityListToApiList(naciniUplate);
        return naciniUplateModel;
    }
}
