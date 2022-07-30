package agri.api.nosql.vakcine_po_svinji;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface VakcinePoSvinjiService {

    @GetMapping(
            value    = "/vakcinePoSvinji/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<VakcinePoSvinjiModel> getVakcinePoSvinji(@PathVariable String tetovir_broj_svinje);
}
