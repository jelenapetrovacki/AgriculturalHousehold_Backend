package agri.api.nosql.terapije_po_danu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;

public interface TerapijePoDanuService {

    @GetMapping(
            value    = "/terapijePoDanu",
            produces = "application/json")
    Collection<TerapijePoDanuModel> getTerapijePoDanu();
}
