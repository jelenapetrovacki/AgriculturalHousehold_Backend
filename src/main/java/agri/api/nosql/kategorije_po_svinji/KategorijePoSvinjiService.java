package agri.api.nosql.kategorije_po_svinji;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;

public interface KategorijePoSvinjiService {

    @GetMapping(
            value    = "/arhivaKategorija/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<KategorijePoSvinjiModel> getKategorije(@PathVariable String tetovir_broj_svinje);
}
