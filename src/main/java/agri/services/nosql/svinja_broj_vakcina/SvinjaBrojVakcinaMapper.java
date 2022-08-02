package agri.services.nosql.svinja_broj_vakcina;

import agri.api.nosql.svinja_broj_vakcina.SvinjaBrojVakcinaModel;
import agri.persistance.nosql.svinja_broj_vakcina.SvinjaBrojVakcina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface SvinjaBrojVakcinaMapper {

    @Mappings({
            @Mapping(target = "tetovir_broj_svinje", source="entity.tetovirBrojSvinje"),
            @Mapping(target = "broj_vakcina", source="entity.brojVakcina")
    })
    SvinjaBrojVakcinaModel entityToApi(SvinjaBrojVakcina entity);

    @Mappings({
            @Mapping(target = "tetovirBrojSvinje", source="api.tetovir_broj_svinje"),
            @Mapping(target = "brojVakcina", source="api.broj_vakcina")
    })
    SvinjaBrojVakcina apiToEntity(SvinjaBrojVakcinaModel api);
}
