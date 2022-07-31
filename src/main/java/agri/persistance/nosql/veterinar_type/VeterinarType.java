package agri.persistance.nosql.veterinar_type;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType("veterinar_type")
public class VeterinarType {
	 @Column(value = "ime") 
	    @CassandraType(type = CassandraType.Name.TEXT) 
	    private String ime;

	 @Column(value = "prezime") 
	    @CassandraType(type = CassandraType.Name.TEXT) 
	    private String prezime;
	 
	 @Column(value = "ustanova") 
	    @CassandraType(type = CassandraType.Name.TEXT) 
	    private String ustanova;
	 
	 @Column(value = "broj_licence") 
	    @CassandraType(type = CassandraType.Name.TEXT) 
	    private String broj_licence;
	 
	 @Column(value = "kontakt") 
	    @CassandraType(type = CassandraType.Name.TEXT) 
	    private String kontakt;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getUstanova() {
		return ustanova;
	}

	public void setUstanova(String ustanova) {
		this.ustanova = ustanova;
	}

	public String getBroj_licence() {
		return broj_licence;
	}

	public void setBroj_licence(String broj_licence) {
		this.broj_licence = broj_licence;
	}

	public String getKontakt() {
		return kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}
	 
	 
}
