package agri.api.nosql.veterinar;

import agri.api.nosql.veterinar_type.VeterinarTypeModel;

public class VeterinarModel {
    private String sifra_veterinara;
    private VeterinarTypeModel veterinar_podaci;

    public VeterinarModel() {
    }

    public String getSifra_veterinara() {
        return sifra_veterinara;
    }

    public void setSifra_veterinara(String sifra_veterinara) {
        this.sifra_veterinara = sifra_veterinara;
    }

    public VeterinarTypeModel getVeterinar_podaci() {
        return veterinar_podaci;
    }

    public void setVeterinar_podaci(VeterinarTypeModel veterinar_podaci) {
        this.veterinar_podaci = veterinar_podaci;
    }
}
