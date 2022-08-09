package agri.persistance.nosql.rasa_kategorija;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "rasa")
public class Rasa {
    @PrimaryKeyColumn(
            name = "oznaka_rase", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String oznakaRase;

    @Column("naziv_rase")
    private String nazivRase;
    private String opis;
    @Column("alternativno_ime")
    private String alternativnoIme;
    @Column("zemlja_porekla")
    private String zemljaPorekla;

    public String getOznakaRase() {
        return oznakaRase;
    }

    public void setOznakaRase(String oznakaRase) {
        this.oznakaRase = oznakaRase;
    }

    public String getNazivRase() {
        return nazivRase;
    }

    public void setNazivRase(String nazivRase) {
        this.nazivRase = nazivRase;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getAlternativnoIme() {
        return alternativnoIme;
    }

    public void setAlternativnoIme(String alternativnoIme) {
        this.alternativnoIme = alternativnoIme;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }
}
