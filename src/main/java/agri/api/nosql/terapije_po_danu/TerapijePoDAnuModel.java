package agri.api.nosql.terapije_po_danu;

import java.util.Date;

public class TerapijePoDAnuModel {

    private int sifra_terapije;
    private int godina;
    private Date datum_od;
    private String tetovir_broj_svinje;
    private Date datum_do;
    private String doza;
    private int dnevni_broj_davanja;
    private String lek;

    public TerapijePoDAnuModel() {
    }

    public TerapijePoDAnuModel(int sifra_terapije, int godina, Date datum_od, String tetovir_broj_svinje, Date datum_do, String doza, int dnevni_broj_davanja, String lek) {
        this.sifra_terapije = sifra_terapije;
        this.godina = godina;
        this.datum_od = datum_od;
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.datum_do = datum_do;
        this.doza = doza;
        this.dnevni_broj_davanja = dnevni_broj_davanja;
        this.lek = lek;
    }

    public int getSifra_terapije() {
        return sifra_terapije;
    }

    public void setSifra_terapije(int sifra_terapije) {
        this.sifra_terapije = sifra_terapije;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public Date getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(Date datum_od) {
        this.datum_od = datum_od;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public Date getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(Date datum_do) {
        this.datum_do = datum_do;
    }

    public String getDoza() {
        return doza;
    }

    public void setDoza(String doza) {
        this.doza = doza;
    }

    public int getDnevni_broj_davanja() {
        return dnevni_broj_davanja;
    }

    public void setDnevni_broj_davanja(int dnevni_broj_davanja) {
        this.dnevni_broj_davanja = dnevni_broj_davanja;
    }

    public String getLek() {
        return lek;
    }

    public void setLek(String lek) {
        this.lek = lek;
    }
}
