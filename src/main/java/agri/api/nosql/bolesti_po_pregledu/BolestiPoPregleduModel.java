package agri.api.nosql.bolesti_po_pregledu;

import java.util.List;

public class BolestiPoPregleduModel {
    private int sifra_pregleda;
    private String oznaka_bolesti;
    private String naziv_bolesti;

    private List<String> simptomi;

    public BolestiPoPregleduModel() {
    }

    public BolestiPoPregleduModel(int sifra_pregleda, String oznaka_bolesti, String naziv_bolesti, List<String> simptomi) {
        this.sifra_pregleda = sifra_pregleda;
        this.oznaka_bolesti = oznaka_bolesti;
        this.naziv_bolesti = naziv_bolesti;
        this.simptomi = simptomi;
    }

    public int getSifra_pregleda() {
        return sifra_pregleda;
    }

    public void setSifra_pregleda(int sifra_pregleda) {
        this.sifra_pregleda = sifra_pregleda;
    }

    public String getOznaka_bolesti() {
        return oznaka_bolesti;
    }

    public void setOznaka_bolesti(String oznaka_bolesti) {
        this.oznaka_bolesti = oznaka_bolesti;
    }

    public String getNaziv_bolesti() {
        return naziv_bolesti;
    }

    public void setNaziv_bolesti(String naziv_bolesti) {
        this.naziv_bolesti = naziv_bolesti;
    }

    public List<String> getSimptomi() {
        return simptomi;
    }

    public void setSimptomi(List<String> simptomi) {
        this.simptomi = simptomi;
    }
}
