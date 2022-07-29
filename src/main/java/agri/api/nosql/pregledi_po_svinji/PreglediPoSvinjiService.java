package agri.api.nosql.pregledi_po_svinji;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;

public interface PreglediPoSvinjiService {

    @GetMapping(
            value    = "/pregledi/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<PreglediPoSvinjiModel> getPregledi(@PathVariable String tetovir_broj_svinje);
}
