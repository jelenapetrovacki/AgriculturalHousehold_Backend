package agri.persistance.nosql.svinje_po_rasi;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

@Table(value = "svinje_po_rasi")
public class Svinje_po_rasi {

    @PrimaryKeyColumn(
            name = "oznaka_rase", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String oznakarase;

    @PrimaryKeyColumn(
            name = "tetovir_broj_svinje",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.ASCENDING)
    private String tetovir_broj_svinje;

    @Column("naziv_rase")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String naziv_rase;

    public String getOznakarase() {
        return oznakarase;
    }

    public void setOznakarase(String oznakarase) {
        this.oznakarase = oznakarase;
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
