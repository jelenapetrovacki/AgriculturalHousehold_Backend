package agri.persistance.nosql.vakcine_po_svinji;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "vakcina")
public class Vakcina {

    @PrimaryKeyColumn(
            name = "sifra_vakcine", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String sifraVakcine;

    @Column("naziv_tipa_vakcine")
    private String nazivTipaVakcine;

    @Column("opis_tipa_vakcine")
    private String opisTipaVakcine;

    public String getSifraVakcine() {
        return sifraVakcine;
    }

    public void setSifraVakcine(String sifraVakcine) {
        this.sifraVakcine = sifraVakcine;
    }

    public String getNazivTipaVakcine() {
        return nazivTipaVakcine;
    }

    public void setNazivTipaVakcine(String nazivTipaVakcine) {
        this.nazivTipaVakcine = nazivTipaVakcine;
    }

    public String getOpisTipaVakcine() {
        return opisTipaVakcine;
    }

    public void setOpisTipaVakcine(String opisTipaVakcine) {
        this.opisTipaVakcine = opisTipaVakcine;
    }
}
