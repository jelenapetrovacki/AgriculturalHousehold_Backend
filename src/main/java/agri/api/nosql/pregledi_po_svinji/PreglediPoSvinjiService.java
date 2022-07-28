package agri.api.nosql.pregledi_po_svinji;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface PreglediPoSvinjiService {

    @GetMapping(
            value    = "/pregledi/{tetovir_broj_svinje}",
            produces = "application/json")
    Integer getPregledi(@PathVariable String tetovir_broj_svinje);
}
