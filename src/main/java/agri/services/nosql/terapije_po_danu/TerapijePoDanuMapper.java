package agri.services.nosql.terapije_po_danu;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import agri.api.nosql.svinje_po_rasi.SvinjePoRasiModel;
import agri.api.nosql.terapije_po_danu.TerapijePoDanuModel;
import agri.persistance.nosql.svinje_po_rasi.Svinje_po_rasi;
import agri.persistance.terapije_po_danu.TerapijePoDanu;

@Mapper(componentModel = "spring")
public interface TerapijePoDanuMapper {
    @Mappings({
        @Mapping(target = "sifra_terapije", source="entity.sifraTerapije"),
        @Mapping(target = "datum_od", source="entity.datumOd"),
        @Mapping(target = "datum_do", source="entity.datumDo")
    })
    TerapijePoDanuModel entityToApi(TerapijePoDanu entity);
    @Mappings({
        @Mapping(target = "sifraTerapije", source="api.sifra_terapije"),
        @Mapping(target = "datumOd", source="api.datum_od"),
        @Mapping(target = "datumDo", source="api.datum_do")
    })
    TerapijePoDanu apiToEntity(TerapijePoDanuModel api);

    Collection<TerapijePoDanuModel> entityListToApiList(Collection<TerapijePoDanu> entity);
}
