package agri.services.uplata;

import agri.api.nacin_uplate.NacinUplateModel;
import agri.api.uplata.UplataModel;
import agri.persistance.nacin_uplate.NacinUplate;
import agri.persistance.uplata.Uplata;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface UplataMapper {

    @Mappings({
            @Mapping(target = "datum_uplate", source="entity.datumUplate"),
            @Mapping(target = "nacin_uplate", source="entity.nacinUplate")
    })
    UplataModel entityToApi(Uplata entity);

    @Mappings({
            @Mapping(target = "datumUplate", source="api.datum_uplate"),
            @Mapping(target = "nacinUplate", source="api.nacin_uplate")
    })
    Uplata apiToEntity(UplataModel api);


    Collection<UplataModel> entityListToApiList(Collection<Uplata> entity);
}
