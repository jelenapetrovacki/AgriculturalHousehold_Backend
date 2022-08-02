package agri.persistance.nosql.svinja_broj_vakcina;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "svinja_broj_vakcina")
public class SvinjaBrojVakcina {

    @PrimaryKeyColumn(
            name = "tetovir_broj_svinje", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String  tetovirBrojSvinje;

    @Column("broj_vakcina")
    @CassandraType(type = CassandraType.Name.COUNTER)
    private long brojVakcina;

    public String getTetovirBrojSvinje() {
        return tetovirBrojSvinje;
    }

    public void setTetovirBrojSvinje(String tetovirBrojSvinje) {
        this.tetovirBrojSvinje = tetovirBrojSvinje;
    }

    public long getBrojVakcina() {
        return brojVakcina;
    }

    public void setBrojVakcina(long brojVakcina) {
        this.brojVakcina = brojVakcina;
    }
}
