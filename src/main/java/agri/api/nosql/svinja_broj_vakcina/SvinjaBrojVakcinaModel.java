package agri.api.nosql.svinja_broj_vakcina;

public class SvinjaBrojVakcinaModel {

    private String  tetovir_broj_svinje;
    private int broj_vakcina;

    public SvinjaBrojVakcinaModel() {
    }

    public SvinjaBrojVakcinaModel(String tetovir_broj_svinje, int broj_vakcina) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.broj_vakcina = broj_vakcina;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public int getBroj_vakcina() {
        return broj_vakcina;
    }

    public void setBroj_vakcina(int broj_vakcina) {
        this.broj_vakcina = broj_vakcina;
    }
}
