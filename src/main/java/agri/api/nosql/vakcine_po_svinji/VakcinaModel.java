package agri.api.nosql.vakcine_po_svinji;

public class VakcinaModel {

    private String sifra_vakcine;
    private String naziv_tipa_vakcine;
    private String opis_tipa_vakcine;

    public VakcinaModel() {
    }

    public String getSifra_vakcine() {
        return sifra_vakcine;
    }

    public void setSifra_vakcine(String sifra_vakcine) {
        this.sifra_vakcine = sifra_vakcine;
    }

    public String getNaziv_tipa_vakcine() {
        return naziv_tipa_vakcine;
    }

    public void setNaziv_tipa_vakcine(String naziv_tipa_vakcine) {
        this.naziv_tipa_vakcine = naziv_tipa_vakcine;
    }

    public String getOpis_tipa_vakcine() {
        return opis_tipa_vakcine;
    }

    public void setOpis_tipa_vakcine(String opis_tipa_vakcine) {
        this.opis_tipa_vakcine = opis_tipa_vakcine;
    }
}
