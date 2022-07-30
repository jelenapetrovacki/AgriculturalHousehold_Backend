package agri.services.nosql.vakcine_po_svinji;

import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiService;
import agri.persistance.nosql.vakcine_po_svinji.VakcinePoSvinjiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;


@RestController
@CrossOrigin
public class VakcinePoSvinjiServiceImpl implements VakcinePoSvinjiService {

    @Autowired
    private VakcinePoSvinjiRepository vakcinePoSvinjiRepository;

    @Autowired
    private VakcinePoSvinjiMapper mapper;

    @Override
    public Collection<VakcinePoSvinjiModel> getVakcinePoSvinji(String tetovir_broj_svinje) {
        return mapper.entityListToApiList(vakcinePoSvinjiRepository.findAllByTetovirBrojSvinje(tetovir_broj_svinje));
    }
}
