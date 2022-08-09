package agri.services.nosql.rasa_kategorija;

import agri.api.nosql.rasa_kategorija.KategorijaModel;
import agri.api.nosql.rasa_kategorija.RasaKategorijaService;
import agri.api.nosql.rasa_kategorija.RasaModel;
import agri.api.nosql.svinja.SvinjaModel;
import agri.api.nosql.svinja.SvinjaService;
import agri.api.nosql.terapije_po_pregledu.TerapijePoPregleduModel;
import agri.persistance.nosql.rasa_kategorija.Kategorija;
import agri.persistance.nosql.rasa_kategorija.KategorijaRepository;
import agri.persistance.nosql.rasa_kategorija.Rasa;
import agri.persistance.nosql.rasa_kategorija.RasaRepository;
import agri.persistance.nosql.svinja.SvinjaRepository;
import agri.services.nosql.svinja.SvinjaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
public class RasaKategorijaServiceImpl implements RasaKategorijaService {

    @Autowired
    private RasaRepository rasaRepository;

    @Autowired
    private RasaMapper rasaMapper;


    @Autowired
    private KategorijaRepository kategorijaRepository;

    @Autowired
    private KategorijaMapper kategorijaMapper;


    @Override
    public Collection<RasaModel> getRase() {
        return rasaMapper.entityListToApiList(rasaRepository.findAll());
    }

    @Override
    public Collection<KategorijaModel> getKategorije() {
        return kategorijaMapper.entityListToApiList(kategorijaRepository.findAll());
    }
}
