package agri.api.nosql.svinje_po_rasi;

public class SvinjePoRasiModel {

    private String oznaka_rase;
    private String tetovir_broj_svinje;
    private String naziv_rase;

    public SvinjePoRasiModel() {
    }

    public SvinjePoRasiModel(String oznaka_rase, String tetovir_broj_svinje, String naziv_rase) {
        this.oznaka_rase = oznaka_rase;
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.naziv_rase = naziv_rase;
    }

    public String getOznaka_rase() {
        return oznaka_rase;
    }

    public void setOznaka_rase(String oznaka_rase) {
        this.oznaka_rase = oznaka_rase;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public String getNaziv_rase() {
        return naziv_rase;
    }

    public void setNaziv_rase(String naziv_rase) {
        this.naziv_rase = naziv_rase;
    }
}

