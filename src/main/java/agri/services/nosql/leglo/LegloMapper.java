package agri.services.nosql.leglo;

import agri.api.nosql.leglo.LegloModel;
import agri.api.nosql.svinja.SvinjaModel;
import agri.persistance.nosql.leglo.Leglo;
import agri.persistance.nosql.svinja.Svinja;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface LegloMapper {

    LegloModel entityToApi(Leglo entity);

    Leglo apiToEntity(LegloModel api);

    Collection<LegloModel> entityListToApiList(Collection<Leglo> entity);
}
