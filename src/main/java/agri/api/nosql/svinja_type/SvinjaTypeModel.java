package agri.api.nosql.svinja_type;

public class SvinjaTypeModel {

    private String tetovir_broj_svinje;
    private String aktuelni_veterinarski_broj;
    private String rasa;
    private String kategorija;
    private String oznaka_legla;
    private String pol;
    private String naziv_gazdinstva;

    public SvinjaTypeModel() {
    }

    public SvinjaTypeModel(String tetovir_broj_svinje, String aktuelni_veterinarski_broj, String rasa, String kategorija, String oznaka_legla, String pol, String naziv_gazdinstva) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.aktuelni_veterinarski_broj = aktuelni_veterinarski_broj;
        this.rasa = rasa;
        this.kategorija = kategorija;
        this.oznaka_legla = oznaka_legla;
        this.pol = pol;
        this.naziv_gazdinstva = naziv_gazdinstva;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public String getAktuelni_veterinarski_broj() {
        return aktuelni_veterinarski_broj;
    }

    public void setAktuelni_veterinarski_broj(String aktuelni_veterinarski_broj) {
        this.aktuelni_veterinarski_broj = aktuelni_veterinarski_broj;
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

    public String getOznaka_legla() {
        return oznaka_legla;
    }

    public void setOznaka_legla(String oznaka_legla) {
        this.oznaka_legla = oznaka_legla;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getNaziv_gazdinstva() {
        return naziv_gazdinstva;
    }

    public void setNaziv_gazdinstva(String naziv_gazdinstva) {
        this.naziv_gazdinstva = naziv_gazdinstva;
    }
}
