package agri.api.nosql.kategorije_po_svinji;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface KategorijePoSvinjiService {

    @GetMapping(
            value    = "/arhivaKategorija/{tetovir_broj_svinje}",
            produces = "application/json")
    Integer getKategorije(@PathVariable String tetovir_broj_svinje);
}
