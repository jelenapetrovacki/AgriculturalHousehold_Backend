package agri.api.nosql.terapije_po_pregledu;

import agri.persistance.nosql.terapije_tuple.TerapijaTuple;

import java.time.LocalDate;
import java.util.UUID;

public class TerapijePoPregleduModel {
    private int sifra_pregleda;
    private UUID sifra_terapije;
    private TerapijaTuple terapija;

    private LocalDate datum_od;
    private LocalDate datum_do;
    private String doza;
    private int dnevni_broj_davanja;

    public TerapijePoPregleduModel() {
    }

    public TerapijePoPregleduModel(int sifra_pregleda, UUID sifra_terapije, TerapijaTuple terapija, LocalDate datum_od,
                                   LocalDate datum_do, String doza, int dnevni_broj_davanja) {
        this.sifra_pregleda = sifra_pregleda;
        this.sifra_terapije = sifra_terapije;
        this.terapija = terapija;
        this.datum_od=datum_od;
        this.datum_do=datum_do;
        this.doza=doza;
        this.dnevni_broj_davanja=dnevni_broj_davanja;
    }

    public int getSifra_pregleda() {
        return sifra_pregleda;
    }

    public void setSifra_pregleda(int sifra_pregleda) {
        this.sifra_pregleda = sifra_pregleda;
    }

    public UUID getSifra_terapije() {
        return sifra_terapije;
    }

    public void setSifra_terapije(UUID sifra_terapije) {
        this.sifra_terapije = sifra_terapije;
    }

    public TerapijaTuple getTerapija() {
        return terapija;
    }

    public void setTerapija(TerapijaTuple terapija) {
        this.terapija = terapija;
    }

    public LocalDate getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(LocalDate datum_od) {
        this.datum_od = datum_od;
    }

    public LocalDate getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(LocalDate datum_do) {
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
}
