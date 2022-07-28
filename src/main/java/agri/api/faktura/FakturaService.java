package agri.api.faktura;

import agri.api.stavka.StavkaModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface FakturaService {

    @GetMapping(
            value    = "/faktura",
            produces = "application/json")
    Collection<FakturaModel> getFakture();

    @GetMapping(
            value    = "/faktureNarudzbina/{narudzbinaId}",
            produces = "application/json")
    Collection<FakturaModel> getFaktureByNarudzbinaId(@PathVariable int narudzbinaId);

    @GetMapping(
            value    = "/brojUplata/{fakturaId}",
            produces = "application/json")
    Integer getBrojUplata(@PathVariable int fakturaId);

    @DeleteMapping(
            value    = "/faktura/{fakturaId}")
    void deleteFaktura(@PathVariable int fakturaId);

    @PostMapping(
            value    = "/faktura",
            consumes = "application/json",
            produces = "application/json")
    FakturaModel createFaktura(@RequestBody FakturaModel body);

    @PutMapping(
            value    = "/faktura",
            consumes = "application/json",
            produces = "application/json")
    FakturaModel updateFaktura(@RequestBody FakturaModel body);
}
