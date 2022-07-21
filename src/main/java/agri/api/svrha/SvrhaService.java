package agri.api.svrha;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public interface SvrhaService {

    @GetMapping(
            value    = "/svrha",
            produces = "application/json")
    Collection<SvrhaModel> getSvrhe();
}
