package agri.services.nosql.veterinar;
import agri.api.nosql.veterinar.VeterinarModel;
import agri.persistance.nosql.veterinar.Veterinar;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.Collection;

@Mapper(componentModel = "spring")
public interface VeterinarMapper {

    @Mappings({
            @Mapping(target = "sifra_veterinara", source="entity.sifraVeterinara"),
            @Mapping(target = "veterinar_podaci", source="entity.veterinarPodaci")
    })
    VeterinarModel entityToApi(Veterinar entity);

    Collection<VeterinarModel> entityListToApiList(Collection<Veterinar> entity);
}
