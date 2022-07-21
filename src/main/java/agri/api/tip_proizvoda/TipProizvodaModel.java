package agri.api.tip_proizvoda;

public class TipProizvodaModel {

    private int id;
    private String naziv_tipa;
    private double jedinicna_cena;
    private boolean aktuelan;

    public TipProizvodaModel() {
    }

    public TipProizvodaModel(int id, String naziv_tipa, double jedinicna_cena, boolean aktuelan) {
        this.id = id;
        this.naziv_tipa = naziv_tipa;
        this.jedinicna_cena = jedinicna_cena;
        this.aktuelan = aktuelan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv_tipa() {
        return naziv_tipa;
    }

    public void setNaziv_tipa(String naziv_tipa) {
        this.naziv_tipa = naziv_tipa;
    }

    public double getJedinicna_cena() {
        return jedinicna_cena;
    }

    public void setJedinicna_cena(double jedinicna_cena) {
        this.jedinicna_cena = jedinicna_cena;
    }

    public boolean isAktuelan() {
        return aktuelan;
    }

    public void setAktuelan(boolean aktuelan) {
        this.aktuelan = aktuelan;
    }
}
