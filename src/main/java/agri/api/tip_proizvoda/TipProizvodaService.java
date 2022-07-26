package agri.api.tip_proizvoda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface TipProizvodaService {
    @GetMapping(
            value    = "/tip_proizvoda",
            produces = "application/json")
    Collection<TipProizvodaModel> getTipoviProizvoda();

    @PostMapping(
            value    = "/tip_proizvoda",
            consumes = "application/json",
            produces = "application/json")
    TipProizvodaModel createTipProizvoda(@RequestBody TipProizvodaModel body);

    @PutMapping(
            value    = "/tip_proizvoda",
            consumes = "application/json",
            produces = "application/json")
    TipProizvodaModel updateTipProizvodaModel(@RequestBody TipProizvodaModel body);
}
