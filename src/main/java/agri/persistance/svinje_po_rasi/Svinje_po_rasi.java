package agri.persistance.svinje_po_rasi;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

@Table(value = "svinje_po_rasi")
public class Svinje_po_rasi {

    @PrimaryKeyColumn(
            name = "oznaka_rase", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String oznaka_rase;

    @PrimaryKeyColumn(
            name = "tetovir_broj_svinje",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.DESCENDING)
    private String tetovir_broj_svinje;

    @Column("naziv_rase")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String naziv_rase;

    public String getOznaka_rase() {
        return oznaka_rase;
    }

    public void setOznaka_rase(String oznaka_rase) {
        this.oznaka_rase = oznaka_rase;
    }

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public String getNaziv_rase() {
        return naziv_rase;
    }

    public void setNaziv_rase(String naziv_rase) {
        this.naziv_rase = naziv_rase;
    }
}