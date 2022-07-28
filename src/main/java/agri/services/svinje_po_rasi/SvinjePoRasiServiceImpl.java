package agri.services.svinje_po_rasi;

import agri.persistance.svinje_po_rasi.Svinje_po_rasi;
import agri.persistance.svinje_po_rasi.Svinje_po_rasi_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
public class SvinjePoRasiServiceImpl {

    @Autowired
    private Svinje_po_rasi_Repository svinje_po_rasi_Repository;

    @GetMapping("/svinjePoRasi")
    public Collection<Svinje_po_rasi> getSvinjePoRasi() {
        return svinje_po_rasi_Repository.findAll();
    }
}