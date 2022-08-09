package agri.api.nosql.svinja;

import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import agri.api.nosql.veterinarski_broj_po_svinji.VetrinarskiBrojPoSvinjiModel;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface SvinjaService {

    @GetMapping(
            value    = "/svinje",
            produces = "application/json")
    Collection<SvinjaModel> getSvinje();

    @PutMapping(
            value    = "/svinje/{staraKategorija}",
            produces = "application/json",
            consumes = "application/json")
    void updateSvinja(@RequestBody SvinjaModel svinjaModel, @PathVariable String staraKategorija);

    @GetMapping(
            value    = "/svinjeRasa/{rasa}",
            produces = "application/json")
    Collection<SvinjaModel> getSvinjeRasa(@PathVariable String rasa);

    @GetMapping(
            value    = "/svinjeKategorija/{kategorija}",
            produces = "application/json")
    Collection<SvinjaModel> getSvinjeKategorija(@PathVariable String kategorija);



}
