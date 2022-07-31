package agri.persistance.nosql.terapije_tuple;

import org.springframework.data.cassandra.core.mapping.Element;
import org.springframework.data.cassandra.core.mapping.Tuple;

@Tuple
public class TerapijaTuple {
    @Element(0) String naziv_terapije;

    @Element(1) String tip_terapije;

    public String getNaziv_terapije() {
        return naziv_terapije;
    }

    public void setNaziv_terapije(String naziv_terapije) {
        this.naziv_terapije = naziv_terapije;
    }

    public String getTip_terapije() {
        return tip_terapije;
    }

    public void setTip_terapije(String tip_terapije) {
        this.tip_terapije = tip_terapije;
    }
}
