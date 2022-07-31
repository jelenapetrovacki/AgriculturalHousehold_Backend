package agri.persistance.nosql.svinja_type;

import com.datastax.oss.driver.api.core.type.DataType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.UserDefinedType;

@UserDefinedType("svinja_type")
public class SvinjaType {
    @Column(value = "tetovir_broj_svinje") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String tetovir_broj_svinje;

    @Column(value = "aktuelni_veterinarski_broj") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String aktuelni_veterinarski_broj;

    @Column(value = "rasa") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String rasa;

    @Column(value = "kategorija") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String kategorija;

    @Column(value = "oznaka_legla") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String oznaka_legla;

    @Column(value = "pol") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String pol;

    @Column(value = "naziv_gazdinstva") //OPT
    @CassandraType(type = CassandraType.Name.TEXT) //OPT
    private String naziv_gazdinstva;

    public String getTetovir_broj_svinje() {
        return tetovir_broj_svinje;
    }

    public void setTetovir_broj_svinje(String tetovir_broj_svinje) {
        this.tetovir_broj_svinje = tetovir_broj_svinje;
    }

    public String getAktuelni_veterinarski_broj() {
        return aktuelni_veterinarski_broj;
    }

    public void setAktuelni_veterinarski_broj(String aktuelni_veterinarski_broj) {
        this.aktuelni_veterinarski_broj = aktuelni_veterinarski_broj;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getKategorija() {
        return kategorija;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getOznaka_legla() {
        return oznaka_legla;
    }

    public void setOznaka_legla(String oznaka_legla) {
        this.oznaka_legla = oznaka_legla;
    }

    public String getPol() {
        return pol;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getNaziv_gazdinstva() {
        return naziv_gazdinstva;
    }

    public void setNaziv_gazdinstva(String naziv_gazdinstva) {
        this.naziv_gazdinstva = naziv_gazdinstva;
    }
    
}
