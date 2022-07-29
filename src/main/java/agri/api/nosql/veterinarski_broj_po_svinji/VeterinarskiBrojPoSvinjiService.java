package agri.api.nosql.veterinarski_broj_po_svinji;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface VeterinarskiBrojPoSvinjiService {

    @GetMapping(
            value    = "/arhivaVeterinarskogBroja/{tetovir_broj_svinje}",
            produces = "application/json")
    Collection<VetrinarskiBrojPoSvinjiModel> getArhivaVeterinarskogBroja(@PathVariable String tetovir_broj_svinje);
}
