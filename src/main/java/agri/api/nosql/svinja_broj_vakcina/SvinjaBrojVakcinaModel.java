package agri.api.nosql.svinja_broj_vakcina;

public class SvinjaBrojVakcinaModel {

    private String  tetovir_broj_svinje;
    private long broj_vakcina;

    public SvinjaBrojVakcinaModel() {
    }

    public SvinjaBrojVakcinaModel(String tetovir_broj_svinje, long broj_vakcina) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.broj_vakcina = broj_vakcina;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public long getBroj_vakcina() {
        return broj_vakcina;
    }

    public void setBroj_vakcina(long broj_vakcina) {
        this.broj_vakcina = broj_vakcina;
    }
}
