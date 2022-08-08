package agri.persistance.nosql.vakcine_po_svinji;

import agri.persistance.nosql.veterinar_type.VeterinarType;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.time.LocalDate;
import java.util.UUID;

@Table(value = "vakcine_po_svinji")
public class VakcinePoSvinji {

    @PrimaryKeyColumn(
            name = "tetovir_broj_svinje", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String tetovirBrojSvinje;

    @PrimaryKeyColumn(
            name = "sifra_davanja_vakcine",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.ASCENDING)
    @CassandraType(type = CassandraType.Name.TIMEUUID)
    private UUID sifraDavanjaVakcine;

    @Column("datum_davanja")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datumDavanja;

    @Column("sifra_vakcine")
    private String sifraVakcine;

    @Column("kolicina_doze_vakcine")
    @CassandraType(type = CassandraType.Name.INT)
    private String kolicinaDozeVakcine;
    @Column("naziv_tipa_vakcine")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String nazivTipaVakcine;

    @Column("opis_tipa_vakcine")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String opisTipaVakcine;

    @Column("veterinar")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "veterinar_type")
    @Frozen
    private VeterinarType veterinar;

    public String getTetovirBrojSvinje() {
        return tetovirBrojSvinje;
    }

    public void setTetovirBrojSvinje(String tetovirBrojSvinje) {
        this.tetovirBrojSvinje = tetovirBrojSvinje;
    }


    public UUID getSifraDavanjaVakcine() {
        return sifraDavanjaVakcine;
    }

    public void setSifraDavanjaVakcine(UUID sifraDavanjaVakcine) {
        this.sifraDavanjaVakcine = sifraDavanjaVakcine;
    }

    public LocalDate getDatumDavanja() {
        return datumDavanja;
    }

    public void setDatumDavanja(LocalDate datumDavanja) {
        this.datumDavanja = datumDavanja;
    }

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

    public VeterinarType getVeterinar() {
        return veterinar;
    }

    public void setVeterinar(VeterinarType veterinar) {
        this.veterinar = veterinar;
    }

    public String getKolicinaDozeVakcine() {
        return kolicinaDozeVakcine;
    }

    public void setKolicinaDozeVakcine(String kolicinaDozeVakcine) {
        this.kolicinaDozeVakcine = kolicinaDozeVakcine;
    }
}
