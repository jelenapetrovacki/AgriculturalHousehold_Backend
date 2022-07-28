package agri.api.nosql.svinje_po_rasi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public interface SvinjePoRasiService {

    @GetMapping(
            value    = "/rasa/{oznaka_rase}",
            produces = "application/json")
    Collection<SvinjePoRasiModel> getRasa(@PathVariable String oznaka_rase);
}
