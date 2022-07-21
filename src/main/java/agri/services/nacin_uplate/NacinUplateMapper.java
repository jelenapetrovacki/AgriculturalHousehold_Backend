package agri.services.nacin_uplate;

import agri.api.nacin_uplate.NacinUplateModel;
import agri.persistance.nacin_uplate.NacinUplate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface NacinUplateMapper {
    @Mappings({
            @Mapping(target = "nacin_uplate", source="entity.nacinUplate")
    })
    NacinUplateModel entityToApi(NacinUplate entity);

    @Mappings({
            @Mapping(target = "nacinUplate", source="api.nacin_uplate")
    })
    NacinUplate apiToEntity(NacinUplateModel api);


    Collection<NacinUplateModel> entityListToApiList(Collection<NacinUplate> entity);
}
