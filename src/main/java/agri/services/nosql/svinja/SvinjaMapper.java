package agri.services.nosql.svinja;

import agri.api.nosql.svinja.SvinjaModel;
import agri.persistance.nosql.svinja.Svinja;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface SvinjaMapper {

    SvinjaModel entityToApi(Svinja entity);

    Svinja apiToEntity(SvinjaModel api);

    Collection<SvinjaModel> entityListToApiList(Collection<Svinja> entity);
}
