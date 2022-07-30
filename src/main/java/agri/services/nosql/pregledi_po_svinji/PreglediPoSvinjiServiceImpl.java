package agri.services.nosql.pregledi_po_svinji;

import agri.api.nosql.pregledi_po_svinji.PreglediPoSvinjiModel;
import agri.api.nosql.pregledi_po_svinji.PreglediPoSvinjiService;
import agri.persistance.nosql.pregledi_po_svinji.PreglediPoSvinjiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@CrossOrigin
public class PreglediPoSvinjiServiceImpl implements PreglediPoSvinjiService {

    @Autowired
    private PreglediPoSvinjiRepository preglediPoSvinjiRepository;

    @Autowired
    private PreglediPoSvinjiMapper mapper;


    @Override
    public Collection<PreglediPoSvinjiModel> getPreglediPoSvinji(String tetovir_broj_svinje) {
        return mapper.entityListToApiList(preglediPoSvinjiRepository.findAllByTetovirBrojSvinje(tetovir_broj_svinje));
    }
}
