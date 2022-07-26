package agri.api.klijent;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

public interface KlijentService {

    @GetMapping(
            value    = "/klijent",
            produces = "application/json")
    Collection<KlijentModel> getKlijenti();

    @PostMapping(
            value    = "/klijent",
            consumes = "application/json",
            produces = "application/json")
    KlijentModel createKlijent(@RequestBody KlijentModel body);
    
    @PutMapping(
            value    = "/klijent",
            consumes = "application/json",
            produces = "application/json")
    KlijentModel updateKlijent(@RequestBody KlijentModel body);
}
