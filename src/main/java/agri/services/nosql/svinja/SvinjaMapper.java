package agri.services.nosql.svinja;

import agri.api.nosql.svinja.SvinjaModel;
import agri.persistance.nosql.svinja.Svinja;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface SvinjaMapper {

    @Mappings({
            @Mapping(target = "tetovir_broj_svinje", source="entity.tetovirBrojSvinje")})
    SvinjaModel entityToApi(Svinja entity);

    @Mappings({
            @Mapping(target = "tetovirBrojSvinje", source="api.tetovir_broj_svinje")})
    Svinja apiToEntity(SvinjaModel api);

    Collection<SvinjaModel> entityListToApiList(Collection<Svinja> entity);
}
