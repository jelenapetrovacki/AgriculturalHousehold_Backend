package agri.api.nosql.rasa_kategorija;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public interface RasaKategorijaService {
    @GetMapping(
            value    = "/rase",
            produces = "application/json")
    Collection<RasaModel> getRase();

    @GetMapping(
            value    = "/kategorije",
            produces = "application/json")
    Collection<KategorijaModel> getKategorije();
}
