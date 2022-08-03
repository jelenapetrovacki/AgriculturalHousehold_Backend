package agri.api.nosql.veterinar;

import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

public interface VeterinarService {

    @GetMapping(
            value    = "/veterinari",
            produces = "application/json")
    Collection<VeterinarModel> getVeterinari();
}
