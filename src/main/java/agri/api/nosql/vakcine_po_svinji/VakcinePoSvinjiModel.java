package agri.api.nosql.vakcine_po_svinji;

import agri.api.nosql.veterinar_type.VeterinarTypeModel;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class VakcinePoSvinjiModel {
    private String tetovir_broj_svinje;
    private UUID sifra_davanja_vakcine;
    private LocalDate datum_davanja;
    private String sifra_vakcine;
    private int kolicina_doze_vakcine;
    private String naziv_tipa_vakcine;
    private String opis_tipa_vakcine;
    private VeterinarTypeModel veterinar;

    public VakcinePoSvinjiModel() {
    }

    public VakcinePoSvinjiModel(String tetovir_broj_svinje, UUID sifra_davanja_vakcine, LocalDate datum_davanja, String sifra_vakcine, String naziv_tipa_vakcine, String opis_tipa_vakcine,
                                VeterinarTypeModel veterinar, int kolicina_doze_vakcine) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.sifra_davanja_vakcine = sifra_davanja_vakcine;
        this.datum_davanja = datum_davanja;
        this.sifra_vakcine = sifra_vakcine;
        this.naziv_tipa_vakcine = naziv_tipa_vakcine;
        this.opis_tipa_vakcine = opis_tipa_vakcine;
        this.veterinar = veterinar;
        this.kolicina_doze_vakcine = kolicina_doze_vakcine;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public LocalDate getDatum_davanja() {
        return datum_davanja;
    }

    public void setDatum_davanja(LocalDate datum_davanja) {
        this.datum_davanja = datum_davanja;
    }

    public String getSifra_vakcine() {
        return sifra_vakcine;
    }

    public void setSifra_vakcine(String sifra_vakcine) {
        this.sifra_vakcine = sifra_vakcine;
    }

    public String getNaziv_tipa_vakcine() {
        return naziv_tipa_vakcine;
    }

    public void setNaziv_tipa_vakcine(String naziv_tipa_vakcine) {
        this.naziv_tipa_vakcine = naziv_tipa_vakcine;
    }

    public String getOpis_tipa_vakcine() {
        return opis_tipa_vakcine;
    }

    public void setOpis_tipa_vakcine(String opis_tipa_vakcine) {
        this.opis_tipa_vakcine = opis_tipa_vakcine;
    }

    public VeterinarTypeModel getVeterinar() {
        return veterinar;
    }

    public void setVeterinar(VeterinarTypeModel veterinar) {
        this.veterinar = veterinar;
    }

    public UUID getSifra_davanja_vakcine() {
        return sifra_davanja_vakcine;
    }

    public void setSifra_davanja_vakcine(UUID sifra_davanja_vakcine) {
        this.sifra_davanja_vakcine = sifra_davanja_vakcine;
    }

    public int getKolicina_doze_vakcine() {
        return kolicina_doze_vakcine;
    }

    public void setKolicina_doze_vakcine(int kolicina_doze_vakcine) {
        this.kolicina_doze_vakcine = kolicina_doze_vakcine;
    }
}
