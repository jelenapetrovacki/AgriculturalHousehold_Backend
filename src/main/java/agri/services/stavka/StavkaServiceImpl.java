package agri.services.stavka;

import agri.api.nacin_uplate.NacinUplateModel;
import agri.api.stavka.StavkaModel;
import agri.api.stavka.StavkaService;
import agri.api.uplata.UplataModel;
import agri.persistance.nacin_uplate.NacinUplate;
import agri.persistance.stavka.Stavka;
import agri.persistance.stavka.StavkaRepository;
import agri.persistance.uplata.Uplata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin
@RestController
public class StavkaServiceImpl implements StavkaService {

    @Autowired
    private StavkaRepository stavkaRepository;

    @Autowired
    private StavkaMapper mapper;

    @Override
    public Collection<StavkaModel> getStavke() {
        Collection<Stavka> stavke = stavkaRepository.findAll();
        Collection<StavkaModel> stavkeModel = mapper.entityListToApiList(stavke);
        return stavkeModel;
    }

    @Override
    public Collection<StavkaModel> getStavkeByNarudzbinaId(int narudzbinaId) {
        Collection<Stavka> stavkeByNarudzbina = stavkaRepository.findByNarudzbinaId(narudzbinaId);
        Collection<StavkaModel> stavkeByNarudzbinaModel = mapper.entityListToApiList(stavkeByNarudzbina);
        return stavkeByNarudzbinaModel;
    }

    @Override
    public Collection<StavkaModel> getNefakturisaneStavkeByNarudzbinaId(int narudzbinaId) {
        Collection<Stavka> nefakturisaneStavkeByNarudzbina = stavkaRepository.findNefakturisaneStavkeNarudzbine(narudzbinaId);
        Collection<StavkaModel> nefakturisaneStavkeByNarudzbinaModel = mapper.entityListToApiList(nefakturisaneStavkeByNarudzbina);
        return nefakturisaneStavkeByNarudzbinaModel;
    }

    @Override
    public Collection<StavkaModel> getStavkeByFakturaId(int fakturaId) {
        Collection<Stavka> stavkeByFaktura = stavkaRepository.findByFakturaId(fakturaId);
        Collection<StavkaModel> stavkeByFakturaModel = mapper.entityListToApiList(stavkeByFaktura);
        return stavkeByFakturaModel;
    }


    @Override
    public StavkaModel createStavka(StavkaModel body) {
        Stavka stavka = mapper.apiToEntity(body);
        Stavka novaStavka = stavkaRepository.save(stavka);
        return mapper.entityToApi(novaStavka);
    }

    @Override
    public StavkaModel updateStavka(StavkaModel body) {
        return createStavka(body);
    }

    @Override
    public void updateStavke(StavkaModel[] body) {
        System.out.println(body[0].getKolicina());
        Collection<Stavka> stavke = mapper.apiListToEntityList(Arrays.asList(body));
        stavke.removeIf(Objects::isNull);
        stavkaRepository.saveAll(stavke);
    }

    @Override
    public void deleteStavka(int stavkaId) {
        stavkaRepository.deleteById(stavkaId);
    }
}
