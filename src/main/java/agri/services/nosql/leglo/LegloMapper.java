package agri.services.nosql.leglo;

import agri.api.nosql.leglo.LegloModel;
import agri.api.nosql.svinja.SvinjaModel;
import agri.persistance.nosql.leglo.Leglo;
import agri.persistance.nosql.svinja.Svinja;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface LegloMapper {

    @Mappings({
        @Mapping(target = "oznaka_legla", source="entity.oznakalegla")
    })
    LegloModel entityToApi(Leglo entity);

    @Mappings({
        @Mapping(target = "oznakalegla", source="api.oznaka_legla")
    })
    Leglo apiToEntity(LegloModel api);

    Collection<LegloModel> entityListToApiList(Collection<Leglo> entity);
}
