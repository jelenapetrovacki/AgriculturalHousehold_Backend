package agri.persistance.nosql.bolesti_po_pregledu;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;
import java.util.List;

@Table(value = "bolesti_po_pregledu")
public class BolestiPoPregledu {

    @PrimaryKeyColumn(
            name = "sifra_pregleda", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private int sifraPregleda;

    @PrimaryKeyColumn(
            name = "oznaka_bolesti",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.ASCENDING)
    private String oznakaBolesti;

    //@Column and @CassandraType nisu neophodni
    @CassandraType(type = CassandraType.Name.TEXT)
    @Column("naziv_bolesti")
    private String nazivBolesti;

    @CassandraType(type = CassandraType.Name.LIST, typeArguments = { CassandraType.Name.TEXT })
    private List<String> simptomi;

    public int getSifraPregleda() {
        return sifraPregleda;
    }

    public void setSifraPregleda(int sifraPregleda) {
        this.sifraPregleda = sifraPregleda;
    }

    public String getOznakaBolesti() {
        return oznakaBolesti;
    }

    public void setOznakaBolesti(String oznakaBolesti) {
        this.oznakaBolesti = oznakaBolesti;
    }

    public String getNazivBolesti() {
        return nazivBolesti;
    }

    public void setNazivBolesti(String nazivBolesti) {
        this.nazivBolesti = nazivBolesti;
    }

    public List<String> getSimptomi() {
        return simptomi;
    }

    public void setSimptomi(List<String> simptomi) {
        this.simptomi = simptomi;
    }
}
