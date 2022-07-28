package agri.api.uplata;

import agri.api.faktura.FakturaModel;
import agri.persistance.nacin_uplate.NacinUplate;

import java.util.Date;

public class UplataModel {

    private int id;
    private Date datum_uplate;
    private FakturaModel faktura;

    private NacinUplate nacin_uplate;

    public UplataModel() {
    }

    public UplataModel(int id, Date datum_uplate, FakturaModel faktura, NacinUplate nacin_uplate) {
        this.id = id;
        this.datum_uplate = datum_uplate;
        this.faktura = faktura;
        this.nacin_uplate = nacin_uplate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatum_uplate() {
        return datum_uplate;
    }

    public void setDatum_uplate(Date datum_uplate) {
        this.datum_uplate = datum_uplate;
    }

    public FakturaModel getFaktura() {
        return faktura;
    }

    public void setFaktura(FakturaModel faktura) {
        this.faktura = faktura;
    }

    public NacinUplate getNacin_uplate() {
        return nacin_uplate;
    }

    public void setNacin_uplate(NacinUplate nacin_uplate) {
        this.nacin_uplate = nacin_uplate;
    }
}
