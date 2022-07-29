package agri.api.nosql.terapije_po_pregledu;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;

public interface TerapijePoPregleduService {

    @GetMapping(
            value    = "/terapije/{sifra_pregleda}",
            produces = "application/json")
    Collection<TerapijePoPregleduModel> getTerapije(@PathVariable int sifra_pregleda);
}
