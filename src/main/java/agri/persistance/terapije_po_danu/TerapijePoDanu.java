package agri.persistance.terapije_po_danu;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "terapije_po_danu")
public class TerapijePoDanu {
	
	@PrimaryKeyColumn(
            name = "sifra_terapije", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID sifraTerapije;
	
	@PrimaryKeyColumn(
            name = "godina", ordinal = 1, type = PrimaryKeyType.PARTITIONED)
    private Integer godina;

    @PrimaryKeyColumn(
            name = "datum_od",
            ordinal = 2,
            type = PrimaryKeyType.CLUSTERED,
            ordering = Ordering.ASCENDING)
    private LocalDate datumOd;
    
    @Column("tetovir_broj_svinje")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String tetovir_broj_svinje;
    
    @Column("datum_do")
    @CassandraType(type = CassandraType.Name.DATE)
    private LocalDate datumDo;
    
    @Column("doza")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String doza;
    
    @Column("dnevni_broj_davanja")
    @CassandraType(type = CassandraType.Name.INT)
    private Integer dnevni_broj_davanja;
    
    @Column("lek")
    @CassandraType(type = CassandraType.Name.TEXT)
    private String lek;

	public UUID getSifraTerapije() {
		return sifraTerapije;
	}

	public void setSifraTerapije(UUID sifraTerapije) {
		this.sifraTerapije = sifraTerapije;
	}

	public Integer getGodina() {
		return godina;
	}

	public void setGodina(Integer godina) {
		this.godina = godina;
	}

	public LocalDate getDatumOd() {
		return datumOd;
	}

	public void setDatumOd(LocalDate datum_od) {
		this.datumOd = datum_od;
	}

	public String getTetovir_broj_svinje() {
		return tetovir_broj_svinje;
	}

	public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
		this.tetovir_broj_svinje = tetovir_broj_svinje;
	}

	public LocalDate getDatumDo() {
		return datumDo;
	}

	public void setDatumDo(LocalDate datum_do) {
		this.datumDo = datum_do;
	}

	public String getDoza() {
		return doza;
	}

	public void setDoza(String doza) {
		this.doza = doza;
	}

	public Integer getDnevni_broj_davanja() {
		return dnevni_broj_davanja;
	}

	public void setDnevni_broj_davanja(Integer dnevni_broj_davanja) {
		this.dnevni_broj_davanja = dnevni_broj_davanja;
	}

	public String getLek() {
		return lek;
	}

	public void setLek(String lek) {
		this.lek = lek;
	}
    
    
}
