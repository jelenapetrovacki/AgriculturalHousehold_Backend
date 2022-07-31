package agri.api.nosql.leglo;

import agri.api.nosql.svinja_type.SvinjaTypeModel;

import java.time.LocalDate;
import java.util.List;

public class LegloModel {

    private String oznaka_legla;
    private LocalDate datum_prasenja;
    private LocalDate datum_osemenjavanja;
    private List<String> anomalije;
    private int broj_zivih;
    private int broj_uginulih;
    private String tip_osemenjavanja;
    private SvinjaTypeModel majka;
    private SvinjaTypeModel otac;

    public LegloModel() {
    }

    public LegloModel(String oznaka_legla, LocalDate datum_prasenja, LocalDate datum_osemenjavanja, List<String> anomalije, int broj_zivih, int broj_uginulih, String tip_osemenjavanja, SvinjaTypeModel majka, SvinjaTypeModel otac) {
        this.oznaka_legla = oznaka_legla;
        this.datum_prasenja = datum_prasenja;
        this.datum_osemenjavanja = datum_osemenjavanja;
        this.anomalije = anomalije;
        this.broj_zivih = broj_zivih;
        this.broj_uginulih = broj_uginulih;
        this.tip_osemenjavanja = tip_osemenjavanja;
        this.majka = majka;
        this.otac = otac;
    }

    public String getOznaka_legla() {
        return oznaka_legla;
    }

    public void setOznaka_legla(String oznaka_legla) {
        this.oznaka_legla = oznaka_legla;
    }

    public LocalDate getDatum_prasenja() {
        return datum_prasenja;
    }

    public void setDatum_prasenja(LocalDate datum_prasenja) {
        this.datum_prasenja = datum_prasenja;
    }

    public LocalDate getDatum_osemenjavanja() {
        return datum_osemenjavanja;
    }

    public void setDatum_osemenjavanja(LocalDate datum_osemenjavanja) {
        this.datum_osemenjavanja = datum_osemenjavanja;
    }

    public List<String> getAnomalije() {
        return anomalije;
    }

    public void setAnomalije(List<String> anomalije) {
        this.anomalije = anomalije;
    }

    public int getBroj_zivih() {
        return broj_zivih;
    }

    public void setBroj_zivih(int broj_zivih) {
        this.broj_zivih = broj_zivih;
    }

    public int getBroj_uginulih() {
        return broj_uginulih;
    }

    public void setBroj_uginulih(int broj_uginulih) {
        this.broj_uginulih = broj_uginulih;
    }

    public String getTip_osemenjavanja() {
        return tip_osemenjavanja;
    }

    public void setTip_osemenjavanja(String tip_osemenjavanja) {
        this.tip_osemenjavanja = tip_osemenjavanja;
    }

    public SvinjaTypeModel getMajka() {
        return majka;
    }

    public void setMajka(SvinjaTypeModel majka) {
        this.majka = majka;
    }

    public SvinjaTypeModel getOtac() {
        return otac;
    }

    public void setOtac(SvinjaTypeModel otac) {
        this.otac = otac;
    }
}
