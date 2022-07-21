package agri.api.narudzbina;

import agri.persistance.klijent.Klijent;

import java.util.Date;

public class NarudzbinaModel {

    private int id;
    private Date datum;
    private double iznos;
    private Klijent klijent;

    public NarudzbinaModel() {
    }

    public NarudzbinaModel(int id, Date datum, double iznos, Klijent klijent) {
        this.id = id;
        this.datum = datum;
        this.iznos = iznos;
        this.klijent = klijent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public double getIznos() {
        return iznos;
    }

    public void setIznos(double iznos) {
        this.iznos = iznos;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }
}
