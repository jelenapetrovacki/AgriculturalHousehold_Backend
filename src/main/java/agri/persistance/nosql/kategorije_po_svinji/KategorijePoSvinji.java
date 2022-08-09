package agri.persistance.nosql.kategorije_po_svinji;

import java.time.LocalDate;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "kategorije_po_svinji")
public class KategorijePoSvinji {
	
	@PrimaryKeyColumn(
            name = "tetovir_broj_svinje", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String tetovirBrojSvinje;

	@PrimaryKeyColumn(
			name = "naziv_kategorije",
			ordinal = 1,
			type = PrimaryKeyType.CLUSTERED,
			ordering = Ordering.ASCENDING)
	private String nazivKategorije;

	@PrimaryKeyColumn(
            name = "datum_od",
            ordinal = 2,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.DESCENDING)
    private LocalDate datum_od;


    @Column("datum_do")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datum_do;

	public KategorijePoSvinji(){}
	public KategorijePoSvinji(String tetovirBrojSvinje, LocalDate datum_od, String nazivKategorije, LocalDate datum_do) {
		this.tetovirBrojSvinje = tetovirBrojSvinje;
		this.datum_od = datum_od;
		this.nazivKategorije = nazivKategorije;
		this.datum_do = datum_do;
	}

	public String getTetovirBrojSvinje() {
		return tetovirBrojSvinje;
	}

	public void setTetovirBrojSvinje(String tetovirBrojSvinje) {
		this.tetovirBrojSvinje = tetovirBrojSvinje;
	}

	public LocalDate getDatum_od() {
		return datum_od;
	}

	public void setDatum_od(LocalDate datum_od) {
		this.datum_od = datum_od;
	}

	public String getNazivKategorije() {
		return nazivKategorije;
	}

	public void setNazivKategorije(String nazivKategorije) {
		this.nazivKategorije = nazivKategorije;
	}

	public LocalDate getDatum_do() {
		return datum_do;
	}

	public void setDatum_do(LocalDate datum_do) {
		this.datum_do = datum_do;
	}

    
}
