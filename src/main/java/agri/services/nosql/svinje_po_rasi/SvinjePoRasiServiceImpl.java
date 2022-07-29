package agri.services.nosql.svinje_po_rasi;

import agri.api.nosql.svinje_po_rasi.SvinjePoRasiModel;
import agri.api.nosql.svinje_po_rasi.SvinjePoRasiService;
import agri.persistance.nosql.svinje_po_rasi.Svinje_po_rasi;
import agri.persistance.nosql.svinje_po_rasi.Svinje_po_rasi_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;


@RestController
@CrossOrigin
public class SvinjePoRasiServiceImpl implements SvinjePoRasiService {

    @Autowired
    private Svinje_po_rasi_Repository svinje_po_rasi_Repository;

    @Autowired
    private SvinjePoRasiMapper mapper;

    @Override
    public Collection<SvinjePoRasiModel> getRasa(String oznaka_rase) {
        return mapper.entityListToApiList(svinje_po_rasi_Repository.findOneByOznakarase(oznaka_rase));
    }
}
