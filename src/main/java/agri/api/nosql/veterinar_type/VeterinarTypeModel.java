package agri.api.nosql.veterinar_type;

public class VeterinarTypeModel {
    private String ime;
    private String prezime;
    private String ustanova;
    private String broj_licence;
    private String kontakt;


    public VeterinarTypeModel() {

    }

    public VeterinarTypeModel(String ime, String prezime, String ustanova, String broj_licence, String kontakt) {
        this.ime = ime;
        this.prezime = prezime;
        this.ustanova = ustanova;
        this.broj_licence = broj_licence;
        this.kontakt = kontakt;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUstanova() {
        return ustanova;
    }

    public void setUstanova(String ustanova) {
        this.ustanova = ustanova;
    }

    public String getBroj_licence() {
        return broj_licence;
    }

    public void setBroj_licence(String broj_licence) {
        this.broj_licence = broj_licence;
    }

    public String getKontakt() {
        return kontakt;
    }

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }
}

