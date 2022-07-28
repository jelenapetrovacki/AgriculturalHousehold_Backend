package agri.services.nosql.svinje_po_rasi;

import agri.api.nosql.svinje_po_rasi.SvinjePoRasiModel;
import agri.persistance.nosql.svinje_po_rasi.Svinje_po_rasi;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface SvinjePoRasiMapper {

    @Mappings({
            @Mapping(target = "oznaka_rase", source="entity.oznakarase")
    })
    SvinjePoRasiModel entityToApi(Svinje_po_rasi entity);
    @Mappings({
            @Mapping(target = "oznakarase", source="api.oznaka_rase")
    })
    Svinje_po_rasi apiToEntity(SvinjePoRasiModel api);

    Collection<SvinjePoRasiModel> entityListToApiList(Collection<Svinje_po_rasi> entity);
}
