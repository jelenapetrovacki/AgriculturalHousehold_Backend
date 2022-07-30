package agri.services.nosql.pregledi_po_svinji;

import agri.api.nosql.pregledi_po_svinji.PreglediPoSvinjiModel;
import agri.persistance.nosql.pregledi_po_svinji.PreglediPoSvinji;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface PreglediPoSvinjiMapper {

    @Mappings({
            @Mapping(target = "tetovir_broj_svinje", source="entity.tetovirBrojSvinje"),
            @Mapping(target = "sifra_pregleda", source="entity.sifraPregleda"),
            @Mapping(target = "naziv_pregleda", source="entity.nazivPregleda"),
            @Mapping(target = "datum_pregleda", source="entity.datumPregleda")
    })
    PreglediPoSvinjiModel entityToApi(PreglediPoSvinji entity);

    @Mappings({
            @Mapping(target = "tetovirBrojSvinje", source="api.tetovir_broj_svinje"),
            @Mapping(target = "sifraPregleda", source="api.sifra_pregleda"),
            @Mapping(target = "nazivPregleda", source="api.naziv_pregleda"),
            @Mapping(target = "datumPregleda", source="api.datum_pregleda")
    })
    PreglediPoSvinji apiToEntity(PreglediPoSvinjiModel api);

    Collection<PreglediPoSvinjiModel> entityListToApiList(Collection<PreglediPoSvinji> entity);
}
