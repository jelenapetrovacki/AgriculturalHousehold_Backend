package agri.api.nosql.svinja;

public class SvinjaModel {

    private String tetovir_broj_svinje;
    private String oznaka_legla;
    private String rasa;
    private String kategorija;
    private String aktuelni_veterinarski_broj;

    public SvinjaModel() {
    }

    public SvinjaModel(String tetovir_broj_svinje, String oznaka_legla, String rasa, String kategorija, String aktuelni_veterinarski_broj) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.oznaka_legla = oznaka_legla;
        this.rasa = rasa;
        this.kategorija = kategorija;
        this.aktuelni_veterinarski_broj = aktuelni_veterinarski_broj;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public String getOznaka_legla() {
        return oznaka_legla;
    }

    public void setOznaka_legla(String oznaka_legla) {
        this.oznaka_legla = oznaka_legla;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getAktuelni_veterinarski_broj() {
        return aktuelni_veterinarski_broj;
    }

    public void setAktuelni_veterinarski_broj(String aktuelni_veterinarski_broj) {
        this.aktuelni_veterinarski_broj = aktuelni_veterinarski_broj;
    }
}
