package agri.services.nosql.kategorije_po_svinji;

import java.util.Collection;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import agri.api.nosql.kategorije_po_svinji.KategorijePoSvinjiModel;
import agri.persistance.nosql.kategorije_po_svinji.KategorijePoSvinji;

@Mapper(componentModel = "spring")
public interface KategorijePoSvinjiMapper {
	@Mappings({
        @Mapping(target = "tetovir_broj_svinje", source="entity.tetovirBrojSvinje"),
            @Mapping(target = "naziv_kategorije", source="entity.nazivKategorije")
    })
    KategorijePoSvinjiModel entityToApi(KategorijePoSvinji entity);
    
    @Mappings({
        @Mapping(target = "tetovirBrojSvinje", source="api.tetovir_broj_svinje"),
            @Mapping(target = "nazivKategorije", source="api.naziv_kategorije")
    })
    KategorijePoSvinji apiToEntity(KategorijePoSvinjiModel api);

    Collection<KategorijePoSvinjiModel> entityListToApiList(Collection<KategorijePoSvinji> entity);

}
