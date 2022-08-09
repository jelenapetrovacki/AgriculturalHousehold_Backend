package agri.api.nosql.rasa_kategorija;

public class RasaModel {
    private String oznaka_rase;
    private String naziv_rase;
    private String opis;
    private String alternativno_ime;
    private String zemlja_porekla;

    public RasaModel() {
    }

    public String getOznaka_rase() {
        return oznaka_rase;
    }

    public void setOznaka_rase(String oznaka_rase) {
        this.oznaka_rase = oznaka_rase;
    }

    public String getNaziv_rase() {
        return naziv_rase;
    }

    public void setNaziv_rase(String naziv_rase) {
        this.naziv_rase = naziv_rase;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getAlternativno_ime() {
        return alternativno_ime;
    }

    public void setAlternativno_ime(String alternativno_ime) {
        this.alternativno_ime = alternativno_ime;
    }

    public String getZemlja_porekla() {
        return zemlja_porekla;
    }

    public void setZemlja_porekla(String zemlja_porekla) {
        this.zemlja_porekla = zemlja_porekla;
    }
}
