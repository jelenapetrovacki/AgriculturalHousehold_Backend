package agri.api.nosql.vakcine_po_svinji;

import agri.api.nosql.veterinar_type.VeterinarTypeModel;

import java.util.Date;
import java.util.UUID;

public class VakcinePoSvinjiModel {
    private String tetovir_broj_svinje;
    private UUID sifra_davanja_vakcine;
    private Date datum_davanja;
    private String sifra_vakcine;
    private String naziv_tipa_vakcine;
    private String opis_tipa_vakcine;
    private VeterinarTypeModel veterinar;

    public VakcinePoSvinjiModel() {
    }

    public VakcinePoSvinjiModel(String tetovir_broj_svinje, Date datum_davanja, String sifra_vakcine, String naziv_tipa_vakcine, String opis_tipa_vakcine, VeterinarTypeModel veterinar) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.datum_davanja = datum_davanja;
        this.sifra_vakcine = sifra_vakcine;
        this.naziv_tipa_vakcine = naziv_tipa_vakcine;
        this.opis_tipa_vakcine = opis_tipa_vakcine;
        this.veterinar = veterinar;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public Date getDatum_davanja() {
        return datum_davanja;
    }

    public void setDatum_davanja(Date datum_davanja) {
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
}
