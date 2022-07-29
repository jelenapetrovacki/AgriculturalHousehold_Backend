package agri.api.nosql.terapije_po_danu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;

import java.util.Collection;
import java.util.Date;

public interface TerapijePoDanuService {

    @GetMapping(
            value    = "/terapijePoDanu/{danasnji_dan}",
            produces = "application/json")
    Collection<TerapijePoDAnuModel> getTerapijePoDanu(@PathVariable Date danasnji_dan);
}
