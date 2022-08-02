package agri.api.nosql.veterinarski_broj_po_svinji;

import java.util.Collection;

import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface VeterinarskiBrojPoSvinjiService {

    @GetMapping(
            value    = "/arhivaVeterinarskogBroja/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<VetrinarskiBrojPoSvinjiModel> getArhivaVeterinarskogBroja(@PathVariable String tetovir_broj_svinje);

    @PostMapping(
            value    = "/arhivaVeterinarskogBroja/{stari_veterinarski_broj}",
            consumes = "application/json")
    void postVeterinarskogBroja(@RequestBody VetrinarskiBrojPoSvinjiModel vetrinarskiBrojPoSvinjiModel,
                                                        @PathVariable String stari_veterinarski_broj);

}
