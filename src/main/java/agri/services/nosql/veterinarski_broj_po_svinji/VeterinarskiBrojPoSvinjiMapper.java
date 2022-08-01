package agri.services.nosql.veterinarski_broj_po_svinji;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


import agri.api.nosql.veterinarski_broj_po_svinji.VetrinarskiBrojPoSvinjiModel;
import agri.persistance.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinji;

@Mapper(componentModel = "spring")
public interface VeterinarskiBrojPoSvinjiMapper {

    @Mappings({
        @Mapping(target = "tetovir_broj_svinje", source="entity.tetovirBrojSvinje"),
            @Mapping(target = "veterinarski_broj", source="entity.veterinarskiBroj")
    })
    VetrinarskiBrojPoSvinjiModel entityToApi(VeterinarskiBrojPoSvinji entity);
    
    @Mappings({
        @Mapping(target = "tetovirBrojSvinje", source="api.tetovir_broj_svinje"),
            @Mapping(target = "veterinarskiBroj", source="api.veterinarski_broj")
    })
    VeterinarskiBrojPoSvinji apiToEntity(VetrinarskiBrojPoSvinjiModel api);

    Collection<VetrinarskiBrojPoSvinjiModel> entityListToApiList(Collection<VeterinarskiBrojPoSvinji> entity);
}
