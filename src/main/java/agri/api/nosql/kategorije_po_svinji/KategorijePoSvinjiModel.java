package agri.api.nosql.kategorije_po_svinji;

import java.time.LocalDate;
import java.util.Date;

public class KategorijePoSvinjiModel {
    private String tetovir_broj_svinje;
    private LocalDate datum_od;
    private String naziv_kategorije;
    private LocalDate datum_do;

    public KategorijePoSvinjiModel() {
    }

    public KategorijePoSvinjiModel(String tetovir_broj_svinje, LocalDate datum_od, String naziv_kategorije, LocalDate datum_do) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.datum_od = datum_od;
        this.naziv_kategorije = naziv_kategorije;
        this.datum_do = datum_do;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public LocalDate getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(LocalDate datum_od) {
        this.datum_od = datum_od;
    }

    public String getNaziv_kategorije() {
        return naziv_kategorije;
    }

    public void setNaziv_kategorije(String naziv_kategorije) {
        this.naziv_kategorije = naziv_kategorije;
    }

    public LocalDate getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(LocalDate datum_do) {
        this.datum_do = datum_do;
    }
}
