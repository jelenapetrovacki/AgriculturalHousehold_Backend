package agri.api.stavka;

import agri.api.narudzbina.NarudzbinaModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface StavkaService {
    @GetMapping(
            value    = "/stavka",
            produces = "application/json")
    Collection<StavkaModel> getStavke();

    @GetMapping(
            value    = "/stavkeNarudzbina/{narudzbinaId}",
            produces = "application/json")
    Collection<StavkaModel> getStavkeByNarudzbinaId(@PathVariable int narudzbinaId);

    @GetMapping(
            value    = "/nefakturisaneStavkeNarudzbina/{narudzbinaId}",
            produces = "application/json")
    Collection<StavkaModel> getNefakturisaneStavkeByNarudzbinaId(@PathVariable int narudzbinaId);

    @GetMapping(
            value    = "/stavkeFaktura/{fakturaId}",
            produces = "application/json")
    Collection<StavkaModel> getStavkeByFakturaId(@PathVariable int fakturaId);

    @PostMapping(
            value    = "/stavka",
            consumes = "application/json",
            produces = "application/json")
    StavkaModel createStavka(@RequestBody StavkaModel body);

    @PutMapping(
            value    = "/stavka",
            consumes = "application/json",
            produces = "application/json")
    StavkaModel updateStavka(@RequestBody StavkaModel body);

    @PutMapping(
            value    = "/stavke",
            consumes = "application/json")
    void updateStavke(@RequestBody StavkaModel[] body);

    @DeleteMapping(value = "/stavka/{stavkaId}")
    void deleteStavka(@PathVariable int stavkaId);
}
