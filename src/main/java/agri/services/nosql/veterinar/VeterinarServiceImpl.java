package agri.services.nosql.veterinar;

import agri.api.nosql.veterinar.VeterinarModel;
import agri.api.nosql.veterinar.VeterinarService;
import agri.persistance.nosql.veterinar.VeterinarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class VeterinarServiceImpl implements VeterinarService {

    @Autowired
    private VeterinarRepository veterinarRepository;

    @Autowired
    private VeterinarMapper mapper;


    @Override
    public Collection<VeterinarModel> getVeterinari() {
        return mapper.entityListToApiList(veterinarRepository.findAll());
    }
}
