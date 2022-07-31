package agri.persistance.nosql.terapije_po_pregledu;


import agri.persistance.nosql.terapije_tuple.TerapijaTuple;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.time.LocalDate;
import java.util.UUID;

@Table(value = "terapije_po_pregledu")
public class TerapijePoPregledu {

    @PrimaryKeyColumn(
            name = "sifra_pregleda", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private int sifraPregleda;
    @PrimaryKeyColumn(
            name = "sifra_terapije",
            ordinal = 1,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.ASCENDING)
    private UUID sifraTerapije;

    @Column("terapija")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "terapija")
    @Frozen
    private TerapijaTuple terapija;

    @Column("datum_od")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datumOd;

    @Column("datum_do")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datumDo;

    private String doza;

    @Column("dnevni_broj_davanja")
    private int dnevniBrojDavanja;

    public int getSifraPregleda() {
        return sifraPregleda;
    }

    public void setSifraPregleda(int sifraPregleda) {
        this.sifraPregleda = sifraPregleda;
    }

    public UUID getSifraTerapije() {
        return sifraTerapije;
    }

    public void setSifraTerapije(UUID sifraTerapije) {
        this.sifraTerapije = sifraTerapije;
    }

    public TerapijaTuple getTerapija() {
        return terapija;
    }

    public void setTerapija(TerapijaTuple terapija) {
        this.terapija = terapija;
    }

    public LocalDate getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(LocalDate datumOd) {
        this.datumOd = datumOd;
    }

    public LocalDate getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(LocalDate datumDo) {
        this.datumDo = datumDo;
    }

    public String getDoza() {
        return doza;
    }

    public void setDoza(String doza) {
        this.doza = doza;
    }

    public int getDnevniBrojDavanja() {
        return dnevniBrojDavanja;
    }

    public void setDnevniBrojDavanja(int dnevniBrojDavanja) {
        this.dnevniBrojDavanja = dnevniBrojDavanja;
    }
}
