package agri.services.nosql.vakcine_po_svinji;

import agri.api.nosql.vakcine_po_svinji.VakcinaModel;
import agri.persistance.nosql.vakcine_po_svinji.Vakcina;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface VakcinaMapper {

    @Mappings({
            @Mapping(target = "sifra_vakcine", source="entity.sifraVakcine"),
            @Mapping(target = "naziv_tipa_vakcine", source="entity.nazivTipaVakcine"),
            @Mapping(target = "opis_tipa_vakcine", source="entity.opisTipaVakcine")
    })
    VakcinaModel entityToApi(Vakcina entity);

    Collection<VakcinaModel> entityListToApiList(Collection<Vakcina> entity);
}
