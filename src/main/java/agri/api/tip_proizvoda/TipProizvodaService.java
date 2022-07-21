package agri.api.tip_proizvoda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface TipProizvodaService {
    @GetMapping(
            value    = "/tipoviproizvoda",
            produces = "application/json")
    Collection<TipProizvodaModel> getTipoviProizvoda();

    @PostMapping(
            value    = "/tipproizvoda",
            consumes = "application/json",
            produces = "application/json")
    TipProizvodaModel createTipProizvoda(@RequestBody TipProizvodaModel body);

    @PutMapping(
            value    = "/tipproizvoda",
            consumes = "application/json",
            produces = "application/json")
    TipProizvodaModel updateTipProizvodaModel(@RequestBody TipProizvodaModel body);
}
