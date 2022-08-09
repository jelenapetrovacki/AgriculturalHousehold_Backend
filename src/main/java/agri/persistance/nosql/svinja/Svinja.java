package agri.persistance.nosql.svinja;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

@Table(value = "svinja")
public class Svinja {

    @PrimaryKeyColumn(
            name = "tetovir_broj_svinje", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String tetovirBrojSvinje;


    @Column("oznaka_legla")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String oznaka_legla;

    @CassandraType(type = CassandraType.Name.TEXT)
    @Indexed("rasa")
    private String rasa;

    @CassandraType(type = CassandraType.Name.TEXT)
    @Indexed("kategorija")
    private String kategorija;

    @Column("aktuelni_veterinarski_broj")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String aktuelni_veterinarski_broj;

    public String getTetovirBrojSvinje() {
        return tetovirBrojSvinje;
    }

    public void setTetovirBrojSvinje(String tetovirBrojSvinje) {
        this.tetovirBrojSvinje = tetovirBrojSvinje;
    }

    public String getOznaka_legla() {
        return oznaka_legla;
    }

    public void setOznaka_legla(String oznaka_legla) {
        this.oznaka_legla = oznaka_legla;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getAktuelni_veterinarski_broj() {
        return aktuelni_veterinarski_broj;
    }

    public void setAktuelni_veterinarski_broj(String aktuelni_veterinarski_broj) {
        this.aktuelni_veterinarski_broj = aktuelni_veterinarski_broj;
    }
}
