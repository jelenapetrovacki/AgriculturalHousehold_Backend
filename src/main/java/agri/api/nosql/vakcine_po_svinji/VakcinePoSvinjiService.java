package agri.api.nosql.vakcine_po_svinji;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface VakcinePoSvinjiService {

    @GetMapping(
            value    = "/vakcinePoSvinji/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<VakcinePoSvinjiModel> getVakcinePoSvinji(@PathVariable String tetovir_broj_svinje);

    @PostMapping(
            value    = "/vakcinePoSvinji",
            produces = "application/json",
            consumes = "application/json")
    VakcinePoSvinjiModel postVakcinePoSvinji(@RequestBody VakcinePoSvinjiModel vakcinePoSvinjiModel);
}
