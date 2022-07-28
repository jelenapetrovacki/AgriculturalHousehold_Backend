package agri.api.nosql.leglo;

import agri.persistance.nosql.leglo.Leglo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public interface LegloService {

    @GetMapping(
            value    = "/leglo/{oznaka_legla}",
            produces = "application/json")
    LegloModel getLeglo(@PathVariable String oznaka_legla);
}
