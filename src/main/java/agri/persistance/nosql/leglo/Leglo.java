package agri.persistance.nosql.leglo;

import agri.persistance.nosql.svinja_type.SvinjaType;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

import java.time.LocalDate;
import java.util.List;

@Table(value = "leglo")
public class Leglo {

    @PrimaryKeyColumn(
            name = "oznaka_legla", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String oznakalegla;

    @Column("datum_prasenja")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datum_prasenja;

    @Column("datum_osemenjavanja")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datum_osemenjavanja;

    @Column("anomalije")
    @CassandraType(type = CassandraType.Name.LIST, typeArguments = { CassandraType.Name.TEXT })
    private List<String> anomalije;

    @Column("broj_zivih")
    @CassandraType(type = CassandraType.Name.INT)
    private Integer broj_zivih;

    @Column("broj_uginulih")
    @CassandraType(type = CassandraType.Name.INT)
    private Integer broj_uginulih;

    @Column("tip_osemenjavanja")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String tip_osemenjavanja;

   @Column("majka")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "svinja_type")
    @Frozen
    private SvinjaType majka;

    @Column("otac")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "svinja_type")
    @Frozen
    private SvinjaType otac;

    public String getOznakalegla() {
        return oznakalegla;
    }

    public void setOznakalegla(String oznakalegla) {
        this.oznakalegla = oznakalegla;
    }

    public LocalDate getDatum_prasenja() {
        return datum_prasenja;
    }

    public void setDatum_prasenja(LocalDate datum_prasenja) {
        this.datum_prasenja = datum_prasenja;
    }

    public LocalDate getDatum_osemenjavanja() {
        return datum_osemenjavanja;
    }

    public void setDatum_osemenjavanja(LocalDate datum_osemenjavanja) {
        this.datum_osemenjavanja = datum_osemenjavanja;
    }

    public List<String> getAnomalije() {
        return anomalije;
    }

    public void setAnomalije(List<String> anomalije) {
        this.anomalije = anomalije;
    }

    public Integer getBroj_zivih() {
        return broj_zivih;
    }

    public void setBroj_zivih(Integer broj_zivih) {
        this.broj_zivih = broj_zivih;
    }

    public Integer getBroj_uginulih() {
        return broj_uginulih;
    }

    public void setBroj_uginulih(Integer broj_uginulih) {
        this.broj_uginulih = broj_uginulih;
    }

    public String getTip_osemenjavanja() {
        return tip_osemenjavanja;
    }

    public void setTip_osemenjavanja(String tip_osemenjavanja) {
        this.tip_osemenjavanja = tip_osemenjavanja;
    }

	public SvinjaType getMajka() {
		return majka;
	}

	public void setMajka(SvinjaType majka) {
		this.majka = majka;
	}

	public SvinjaType getOtac() {
		return otac;
	}

	public void setOtac(SvinjaType otac) {
		this.otac = otac;
	}

}
