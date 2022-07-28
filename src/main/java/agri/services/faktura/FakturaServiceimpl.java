package agri.services.faktura;

import agri.api.faktura.FakturaModel;
import agri.api.faktura.FakturaService;
import agri.api.stavka.StavkaModel;
import agri.persistance.faktura.Faktura;
import agri.persistance.faktura.FakturaRepository;
import agri.persistance.stavka.Stavka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
public class FakturaServiceimpl implements FakturaService {

    @Autowired
    private FakturaRepository fakturaRepository;
    @Autowired
    private FakturaMapper mapper;

    @Override
    public Collection<FakturaModel> getFakture() {
        Collection<Faktura> fakture = fakturaRepository.findAll();
        Collection<FakturaModel> faktureModel = mapper.entityListToApiList(fakture);
        return faktureModel;
    }

    @Override
    public Collection<FakturaModel> getFaktureByNarudzbinaId(int narudzbinaId) {
        Collection<Faktura> faktureByNarudzbina = fakturaRepository.findByNarudzbinaId(narudzbinaId);
        Collection<FakturaModel> faktureByNarudzbinaModel = mapper.entityListToApiList(faktureByNarudzbina);
        return faktureByNarudzbinaModel;
    }

    @Override
    public FakturaModel createFaktura(FakturaModel body) {
        Faktura faktura = mapper.apiToEntity(body);
        Faktura novaFaktura = fakturaRepository.save(faktura);
        return mapper.entityToApi(novaFaktura);
    }

    @Override
    public FakturaModel updateFaktura(FakturaModel body) {
        return createFaktura(body);
    }

	@Override
	public Integer getBrojUplata(int fakturaId) {
		return fakturaRepository.brojUplata(fakturaId);
	}

    @Override
    public void deleteFaktura(int fakturaId) {
        fakturaRepository.deleteById(fakturaId);
    }
}
