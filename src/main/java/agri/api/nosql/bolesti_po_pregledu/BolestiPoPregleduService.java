package agri.api.nosql.bolesti_po_pregledu;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface BolestiPoPregleduService {

    @GetMapping(
            value    = "/bolesti/{sifra_pregleda}",
            produces = "application/json")
    Collection<BolestiPoPregleduModel> getBolesti(@PathVariable int sifra_pregleda);
}
