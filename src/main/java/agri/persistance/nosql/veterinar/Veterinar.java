package agri.persistance.nosql.veterinar;

import agri.api.nosql.veterinar_type.VeterinarTypeModel;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.*;

@Table(value = "veterinar")
public class Veterinar {

    @PrimaryKeyColumn(
            name = "sifra_veterinara", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String sifraVeterinara;

    @Column("veterinar_podaci")
    @CassandraType(type = CassandraType.Name.UDT, userTypeName = "veterinar_type")
    @Frozen
    private VeterinarTypeModel veterinarPodaci;

    public String getSifraVeterinara() {
        return sifraVeterinara;
    }

    public void setSifraVeterinara(String sifraVeterinara) {
        this.sifraVeterinara = sifraVeterinara;
    }

    public VeterinarTypeModel getVeterinarPodaci() {
        return veterinarPodaci;
    }

    public void setVeterinarPodaci(VeterinarTypeModel veterinarPodaci) {
        this.veterinarPodaci = veterinarPodaci;
    }
}
