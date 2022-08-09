package agri.persistance.nosql.rasa_kategorija;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.List;
import java.util.UUID;

@Table(value = "kategorija")
public class Kategorija {

    @PrimaryKeyColumn(
            name = "sifra_kategorije", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID sifraKategorije;
    @Column("naziv_kategorije")
    private String nazivKategorije;
    @Column("pol_svinje")
    private String polSvinje;
    private String uzrast;
    @Column("rasno_poreklo")
    private String rasnoPoreklo;
    @Column("masa_trupa")
    private String masaTrupa;
    private List<String> trup;

    public UUID getSifraKategorije() {
        return sifraKategorije;
    }

    public void setSifraKategorije(UUID sifraKategorije) {
        this.sifraKategorije = sifraKategorije;
    }

    public String getNazivKategorije() {
        return nazivKategorije;
    }

    public void setNazivKategorije(String nazivKategorije) {
        this.nazivKategorije = nazivKategorije;
    }

    public String getPolSvinje() {
        return polSvinje;
    }

    public void setPolSvinje(String polSvinje) {
        this.polSvinje = polSvinje;
    }

    public String getUzrast() {
        return uzrast;
    }

    public void setUzrast(String uzrast) {
        this.uzrast = uzrast;
    }

    public String getRasnoPoreklo() {
        return rasnoPoreklo;
    }

    public void setRasnoPoreklo(String rasnoPoreklo) {
        this.rasnoPoreklo = rasnoPoreklo;
    }

    public String getMasaTrupa() {
        return masaTrupa;
    }

    public void setMasaTrupa(String masaTrupa) {
        this.masaTrupa = masaTrupa;
    }

    public List<String> getTrup() {
        return trup;
    }

    public void setTrup(List<String> trup) {
        this.trup = trup;
    }
}
