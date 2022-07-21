package agri.api.uplata;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface UplataService {
    @GetMapping(
            value    = "/uplata/{fakturaId}",
            produces = "application/json")
    UplataModel getUplataByFakturaID( @PathVariable int fakturaId);

    @PostMapping(
            value    = "/uplata",
            consumes = "application/json",
            produces = "application/json")
    UplataModel createUplata(@RequestBody UplataModel body);

    @DeleteMapping(value = "/uplata/{uplataId}")
    void deleteUplata(@PathVariable int uplataId);

}
