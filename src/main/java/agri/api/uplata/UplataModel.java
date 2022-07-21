package agri.api.uplata;

import agri.api.faktura.FakturaModel;

import java.util.Date;

public class UplataModel {

    private int id;
    private Date datum_uplate;
    private FakturaModel faktura;

    public UplataModel() {
    }

    public UplataModel(int id, Date datum_uplate, FakturaModel faktura) {
        this.id = id;
        this.datum_uplate = datum_uplate;
        this.faktura = faktura;
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
}
