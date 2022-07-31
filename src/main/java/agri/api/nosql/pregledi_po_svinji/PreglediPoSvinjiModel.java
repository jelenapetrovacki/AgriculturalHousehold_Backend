package agri.api.nosql.pregledi_po_svinji;

import agri.api.nosql.veterinar_type.VeterinarTypeModel;

import java.time.LocalDate;

public class PreglediPoSvinjiModel {
    private String tetovir_broj_svinje;
    private int sifra_pregleda;
    private String naziv_pregleda;
    private LocalDate datum_pregleda;
    private String izvestaj;
    private VeterinarTypeModel veterinar;

    public PreglediPoSvinjiModel() {
    }

    public PreglediPoSvinjiModel(String tetovir_broj_svinje, int sifra_pregleda, String naziv_pregleda, LocalDate datum_pregleda, String izvestaj, VeterinarTypeModel veterinar) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.sifra_pregleda = sifra_pregleda;
        this.naziv_pregleda = naziv_pregleda;
        this.datum_pregleda = datum_pregleda;
        this.izvestaj = izvestaj;
        this.veterinar = veterinar;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public int getSifra_pregleda() {
        return sifra_pregleda;
    }

    public void setSifra_pregleda(int sifra_pregleda) {
        this.sifra_pregleda = sifra_pregleda;
    }

    public String getNaziv_pregleda() {
        return naziv_pregleda;
    }

    public void setNaziv_pregleda(String naziv_pregleda) {
        this.naziv_pregleda = naziv_pregleda;
    }

    public LocalDate getDatum_pregleda() {
        return datum_pregleda;
    }

    public void setDatum_pregleda(LocalDate datum_pregleda) {
        this.datum_pregleda = datum_pregleda;
    }

    public String getIzvestaj() {
        return izvestaj;
    }

    public void setIzvestaj(String izvestaj) {
        this.izvestaj = izvestaj;
    }

    public VeterinarTypeModel getVeterinar() {
        return veterinar;
    }

    public void setVeterinar(VeterinarTypeModel veterinar) {
        this.veterinar = veterinar;
    }
}
