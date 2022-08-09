package agri.api.nosql.rasa_kategorija;

import java.util.List;
import java.util.UUID;

public class KategorijaModel {
    private UUID sifra_kategorije;
    private String naziv_kategorije;
    private String pol_svinje;
    private String uzrast;
    private String rasno_poreklo;
    private String masa_trupa;
    private List<String> trup;


    public KategorijaModel() {
    }

    public UUID getSifra_kategorije() {
        return sifra_kategorije;
    }

    public void setSifra_kategorije(UUID sifra_kategorije) {
        this.sifra_kategorije = sifra_kategorije;
    }

    public String getNaziv_kategorije() {
        return naziv_kategorije;
    }

    public void setNaziv_kategorije(String naziv_kategorije) {
        this.naziv_kategorije = naziv_kategorije;
    }

    public String getPol_svinje() {
        return pol_svinje;
    }

    public void setPol_svinje(String pol_svinje) {
        this.pol_svinje = pol_svinje;
    }

    public String getUzrast() {
        return uzrast;
    }

    public void setUzrast(String uzrast) {
        this.uzrast = uzrast;
    }

    public String getRasno_poreklo() {
        return rasno_poreklo;
    }

    public void setRasno_poreklo(String rasno_poreklo) {
        this.rasno_poreklo = rasno_poreklo;
    }

    public String getMasa_trupa() {
        return masa_trupa;
    }

    public void setMasa_trupa(String masa_trupa) {
        this.masa_trupa = masa_trupa;
    }

    public List<String> getTrup() {
        return trup;
    }

    public void setTrup(List<String> trup) {
        this.trup = trup;
    }
}
