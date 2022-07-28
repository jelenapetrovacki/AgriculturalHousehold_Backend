package agri.api.nosql.terapije_po_danu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Date;

public interface TerapijePoDanuService {

    @GetMapping(
            value    = "/terapijePoDanu/{danasnji_dan}",
            produces = "application/json")
    Integer getTerapijePoDanu(@PathVariable Date danasnji_dan);
}
