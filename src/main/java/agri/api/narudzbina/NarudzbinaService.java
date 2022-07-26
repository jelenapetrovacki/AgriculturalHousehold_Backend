package agri.api.narudzbina;

import agri.api.uplata.UplataModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface NarudzbinaService {
    @GetMapping(
            value    = "/narudzbina",
            produces = "application/json")
    Collection<NarudzbinaModel> getNarudzbine();

    @PostMapping(
            value    = "/narudzbina",
            consumes = "application/json",
            produces = "application/json")
    NarudzbinaModel createNarudzbina(@RequestBody NarudzbinaModel body);

    @PutMapping(
            value    = "/narudzbina",
            consumes = "application/json",
            produces = "application/json")
    NarudzbinaModel updateNarudzbina(@RequestBody NarudzbinaModel body);

    @DeleteMapping(value = "/narudzbina/{narudzbinaId}")
    void deleteNarudzbina(@PathVariable int narudzbinaId);
}
