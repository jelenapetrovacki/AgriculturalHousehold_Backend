package agri.services.nosql.svinja;

import agri.api.nosql.svinja.SvinjaModel;
import agri.api.nosql.svinja.SvinjaService;
import agri.persistance.nosql.kategorije_po_svinji.KategorijePoSvinji;
import agri.persistance.nosql.kategorije_po_svinji.KategorijePoSvinjiRepository;
import agri.persistance.nosql.svinja.Svinja;
import agri.persistance.nosql.svinja.SvinjaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@RestController
@CrossOrigin
public class SvinjaServiceImpl implements SvinjaService {

    @Autowired
    private SvinjaRepository svinjaRepository;

    @Autowired
    private SvinjaMapper mapper;

    @Autowired
    private KategorijePoSvinjiRepository kategorijePoSvinjiRepository;

    @Autowired
    private CassandraOperations cassandraOperations;

    @Override
    public Collection<SvinjaModel> getSvinje() {
        return mapper.entityListToApiList(svinjaRepository.findAll());
    }

    @Override
    public void updateSvinja(SvinjaModel svinjaModel, String staraKategorija) {
        //za update svinje
        Svinja retrievedSvinja = svinjaRepository.findByTetovirBrojSvinje(svinjaModel.getTetovir_broj_svinje());
        retrievedSvinja.setKategorija(svinjaModel.getKategorija());

        //za update prethodne vrednosti iz arhive kategorija
       KategorijePoSvinji staraKategorijaZaSvinju = kategorijePoSvinjiRepository.findByTetovirBrojSvinjeAndNazivKategorije
                (svinjaModel.getTetovir_broj_svinje(),staraKategorija);
        staraKategorijaZaSvinju.setDatum_do(LocalDate.now());

        //za insert u arhivu kategorija
        KategorijePoSvinji kategorijePoSvinji = new KategorijePoSvinji(svinjaModel.getTetovir_broj_svinje(),
                LocalDate.now(),svinjaModel.getKategorija(), null);

        cassandraOperations.batchOps().
                update(retrievedSvinja).
                update(staraKategorijaZaSvinju).
                insert(kategorijePoSvinji).
                execute();
    }

    @Override
    public Collection<SvinjaModel> getSvinjeRasa(String rasa) {
        return mapper.entityListToApiList(svinjaRepository.findAllByRasa(rasa));
    }

    @Override
    public Collection<SvinjaModel> getSvinjeKategorija(String kategorija) {
        return mapper.entityListToApiList(svinjaRepository.findAllByKategorija(kategorija));
    }
}
