package agri.persistance.nosql.veterinarski_broj_po_svinji;

import java.time.LocalDate;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.Frozen;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import agri.persistance.nosql.veterinar_type.VeterinarType;
@Table(value = "veterinarski_broj_po_svinji")
public class VeterinarskiBrojPoSvinji {
	
	@PrimaryKeyColumn(
            name = "tetovir_broj_svinje", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String tetovirBrojSvinje;

	@PrimaryKeyColumn(
			name = "veterinarski_broj",
			ordinal = 1,
			type = PrimaryKeyType.CLUSTERED,
			ordering = Ordering.ASCENDING)
	private String veterinarskiBroj;

    @PrimaryKeyColumn(
            name = "datum_od",
            ordinal = 2,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.DESCENDING)
    private LocalDate datum_od;


    @Column("datum_do")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datum_do;
    
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

	public LocalDate getDatum_od() {
		return datum_od;
	}

	public void setDatum_od(LocalDate datum_od) {
		this.datum_od = datum_od;
	}


	public String getVeterinarskiBroj() {
		return veterinarskiBroj;
	}

	public void setVeterinarskiBroj(String veterinarskiBroj) {
		this.veterinarskiBroj = veterinarskiBroj;
	}

	public LocalDate getDatum_do() {
		return datum_do;
	}

	public void setDatum_do(LocalDate datum_do) {
		this.datum_do = datum_do;
	}

	public VeterinarType getVeterinar() {
		return veterinar;
	}

	public void setVeterinar(VeterinarType veterinar) {
		this.veterinar = veterinar;
	}
    
    
    

}
