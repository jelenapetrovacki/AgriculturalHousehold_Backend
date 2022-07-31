package agri.api.nosql.svinja_broj_vakcina;

import agri.api.nosql.svinja.SvinjaModel;
import agri.api.uplata.UplataModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public interface SvinjaBrojVakcinaService {

    @GetMapping(
            value    = "/svinjaBrojVakcina/{tetovir_broj_svinje}",
            produces = "application/json")
    SvinjaBrojVakcinaModel getBrojVakcina(@PathVariable String tetovir_broj_svinje);

}
