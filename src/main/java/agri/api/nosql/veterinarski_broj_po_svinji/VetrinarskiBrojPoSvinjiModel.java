package agri.api.nosql.veterinarski_broj_po_svinji;

import agri.api.nosql.veterinar_type.VeterinarTypeModel;

import java.util.Date;

public class VetrinarskiBrojPoSvinjiModel {

    private String tetovir_broj_svinje;
    private Date datum_od;
    private String veterinarski_broj;
    private Date datum_do;
    private VeterinarTypeModel veterinar;

    public VetrinarskiBrojPoSvinjiModel() {
    }

    public VetrinarskiBrojPoSvinjiModel(String tetovir_broj_svinje, Date datum_od, String veterinarski_broj, Date datum_do, VeterinarTypeModel veterinar) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
        this.datum_od = datum_od;
        this.veterinarski_broj = veterinarski_broj;
        this.datum_do = datum_do;
        this.veterinar = veterinar;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public Date getDatum_od() {
        return datum_od;
    }

    public void setDatum_od(Date datum_od) {
        this.datum_od = datum_od;
    }

    public String getVeterinarski_broj() {
        return veterinarski_broj;
    }

    public void setVeterinarski_broj(String veterinarski_broj) {
        this.veterinarski_broj = veterinarski_broj;
    }

    public Date getDatum_do() {
        return datum_do;
    }

    public void setDatum_do(Date datum_do) {
        this.datum_do = datum_do;
    }

    public VeterinarTypeModel getVeterinar() {
        return veterinar;
    }

    public void setVeterinar(VeterinarTypeModel veterinar) {
        this.veterinar = veterinar;
    }
}



