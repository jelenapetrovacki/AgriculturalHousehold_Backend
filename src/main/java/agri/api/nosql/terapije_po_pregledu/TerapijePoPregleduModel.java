package agri.api.nosql.terapije_po_pregledu;

public class TerapijePoPregleduModel {
    private int sifra_pregleda;
    private int sifra_terapije;
    private String terapija_naziv;
    private String terapije_opis;

    public TerapijePoPregleduModel() {
    }

    public TerapijePoPregleduModel(int sifra_pregleda, int sifra_terapije, String terapija_naziv, String terapije_opis) {
        this.sifra_pregleda = sifra_pregleda;
        this.sifra_terapije = sifra_terapije;
        this.terapija_naziv = terapija_naziv;
        this.terapije_opis = terapije_opis;
    }

    public int getSifra_pregleda() {
        return sifra_pregleda;
    }

    public void setSifra_pregleda(int sifra_pregleda) {
        this.sifra_pregleda = sifra_pregleda;
    }

    public int getSifra_terapije() {
        return sifra_terapije;
    }

    public void setSifra_terapije(int sifra_terapije) {
        this.sifra_terapije = sifra_terapije;
    }

    public String getTerapija_naziv() {
        return terapija_naziv;
    }

    public void setTerapija_naziv(String terapija_naziv) {
        this.terapija_naziv = terapija_naziv;
    }

    public String getTerapije_opis() {
        return terapije_opis;
    }

    public void setTerapije_opis(String terapije_opis) {
        this.terapije_opis = terapije_opis;
    }
}
