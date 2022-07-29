package agri.api.nosql.vakcine_po_svinji;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;

public interface VakcinePoSvinjiService {

    @GetMapping(
            value    = "/vakcine/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<VakcinePoSvinjiModel> getVakcine(@PathVariable String tetovir_broj_svinje);
}
