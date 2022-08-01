package agri.api.nosql.svinja;

import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;

public interface SvinjaService {

    @GetMapping(
            value    = "/svinje",
            produces = "application/json")
    Collection<SvinjaModel> getSvinje();

}
