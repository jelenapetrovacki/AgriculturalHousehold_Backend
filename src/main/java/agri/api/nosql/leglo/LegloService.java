package agri.api.nosql.leglo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface LegloService {

    @GetMapping(
            value    = "/leglo/{oznaka_legla}",
            produces = "application/json")
    Integer getLeglo(@PathVariable String oznaka_legla);
}
