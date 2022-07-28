package agri.api.nosql.vakcine_po_svinji;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface VakcinePoSvinjiService {

    @GetMapping(
            value    = "/vakcine/{tetovir_broj_svinje}",
            produces = "application/json")
    Integer getVakcine(@PathVariable String tetovir_broj_svinje);
}
