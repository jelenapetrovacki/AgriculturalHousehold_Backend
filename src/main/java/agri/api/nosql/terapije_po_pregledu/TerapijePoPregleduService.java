package agri.api.nosql.terapije_po_pregledu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface TerapijePoPregleduService {

    @GetMapping(
            value    = "/terapije/{sifra_pregleda}",
            produces = "application/json")
    Integer getTerapije(@PathVariable int sifra_pregleda);
}
