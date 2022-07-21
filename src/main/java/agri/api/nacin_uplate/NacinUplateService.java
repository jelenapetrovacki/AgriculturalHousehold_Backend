package agri.api.nacin_uplate;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public interface NacinUplateService {

    @GetMapping(
            value    = "/nacini_uplate",
            produces = "application/json")
    Collection<NacinUplateModel> getNaciniUplate();
}
