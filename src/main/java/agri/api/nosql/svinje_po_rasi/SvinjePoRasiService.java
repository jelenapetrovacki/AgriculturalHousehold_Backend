package agri.api.nosql.svinje_po_rasi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface SvinjePoRasiService {

    @GetMapping(
            value    = "/rasa/{oznaka_rase}",
            produces = "application/json")
    Integer getRasa(@PathVariable String oznaka_rase);
}
