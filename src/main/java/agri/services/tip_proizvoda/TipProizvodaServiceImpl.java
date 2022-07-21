package agri.services.tip_proizvoda;

import agri.api.tip_proizvoda.TipProizvodaModel;
import agri.api.tip_proizvoda.TipProizvodaService;
import agri.persistance.tip_proizvoda.TipProizvoda;
import agri.persistance.tip_proizvoda.TipProizvodaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
public class TipProizvodaServiceImpl implements TipProizvodaService {

    @Autowired
    private TipProizvodaRepository tipProizvodaRepository;

    @Autowired
    private TipProizvodaMapper mapper;

    @Override
    public Collection<TipProizvodaModel> getTipoviProizvoda() {
        Collection<TipProizvoda> tipoviProizvoda = tipProizvodaRepository.findAll();
        Collection<TipProizvodaModel> tipoviProizvodaModel = mapper.entityListToApiList(tipoviProizvoda);
        return tipoviProizvodaModel;
    }

    @Override
    public TipProizvodaModel createTipProizvoda(TipProizvodaModel body) {
        TipProizvoda tipProizvoda = mapper.apiToEntity(body);
        TipProizvoda noviTipProizvoda = tipProizvodaRepository.save(tipProizvoda);
        return mapper.entityToApi(noviTipProizvoda);
    }

    @Override
    public TipProizvodaModel updateTipProizvodaModel(TipProizvodaModel body) {
        TipProizvoda tipProizvoda = mapper.apiToEntity(body);
        TipProizvoda noviTipProizvoda = tipProizvodaRepository.save(tipProizvoda);
        return mapper.entityToApi(noviTipProizvoda);
    }
}
