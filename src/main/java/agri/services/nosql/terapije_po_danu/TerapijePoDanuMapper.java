package agri.services.nosql.terapije_po_danu;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import agri.api.nosql.terapije_po_danu.TerapijePoDanuModel;
import agri.persistance.nosql.terapije_po_danu.TerapijePoDanu;

@Mapper(componentModel = "spring")
public interface TerapijePoDanuMapper {
    @Mappings({
        @Mapping(target = "sifra_terapije", source="entity.sifraTerapije"),
        @Mapping(target = "datum_do", source="entity.datumDo")
    })
    TerapijePoDanuModel entityToApi(TerapijePoDanu entity);
    @Mappings({
        @Mapping(target = "sifraTerapije", source="api.sifra_terapije"),
        @Mapping(target = "datumDo", source="api.datum_do")
    })
    TerapijePoDanu apiToEntity(TerapijePoDanuModel api);

    Collection<TerapijePoDanuModel> entityListToApiList(Collection<TerapijePoDanu> entity);
}
