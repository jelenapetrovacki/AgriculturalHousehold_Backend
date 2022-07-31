package agri.persistance.nosql.pregledi_po_svinji;

import agri.persistance.nosql.veterinar_type.VeterinarType;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.time.LocalDate;

@Table(value = "pregledi_po_svinji")
public class PreglediPoSvinji {

    @PrimaryKeyColumn(
            name = "tetovir_broj_svinje", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String tetovirBrojSvinje;

    @PrimaryKeyColumn(
            name = "sifra_pregleda",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.ASCENDING)
    @CassandraType(type = CassandraType.Name.INT)
    private int sifraPregleda;

    @Column("datum_pregleda")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datumPregleda;

    @Column("naziv_pregleda")
    private String nazivPregleda;

    @Column("naziv_tipa_vakcine")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String nazivTipaVakcine;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String izvestaj;

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

    public int getSifraPregleda() {
        return sifraPregleda;
    }

    public void setSifraPregleda(int sifraPregleda) {
        this.sifraPregleda = sifraPregleda;
    }

    public LocalDate getDatumPregleda() {
        return datumPregleda;
    }

    public void setDatumPregleda(LocalDate datumPregleda) {
        this.datumPregleda = datumPregleda;
    }

    public String getNazivPregleda() {
        return nazivPregleda;
    }

    public void setNazivPregleda(String nazivPregleda) {
        this.nazivPregleda = nazivPregleda;
    }

    public String getNazivTipaVakcine() {
        return nazivTipaVakcine;
    }

    public void setNazivTipaVakcine(String nazivTipaVakcine) {
        this.nazivTipaVakcine = nazivTipaVakcine;
    }

    public String getIzvestaj() {
        return izvestaj;
    }

    public void setIzvestaj(String izvestaj) {
        this.izvestaj = izvestaj;
    }

    public VeterinarType getVeterinar() {
        return veterinar;
    }

    public void setVeterinar(VeterinarType veterinar) {
        this.veterinar = veterinar;
    }
}
