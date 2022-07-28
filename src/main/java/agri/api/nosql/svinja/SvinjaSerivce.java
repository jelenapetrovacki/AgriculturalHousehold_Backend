package agri.api.nosql.svinja;

import agri.api.narudzbina.NarudzbinaModel;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public interface SvinjaSerivce {

    @GetMapping(
            value    = "/svinje",
            produces = "application/json")
    Collection<SvinjaModel> getSvinje();
}
