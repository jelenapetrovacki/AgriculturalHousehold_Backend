package agri.services.nosql.bolesi_po_pregledu;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;
import agri.persistance.nosql.bolesti_po_pregledu.BolestiPoPregledu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface BolestiPoPregleduMapper {

    @Mappings({
            @Mapping(target = "sifra_pregleda", source="entity.sifraPregleda"),
            @Mapping(target = "oznaka_bolesti", source="entity.oznakaBolesti"),
            @Mapping(target = "naziv_bolesti", source="entity.nazivBolesti")
    })
    BolestiPoPregleduModel entityToApi(BolestiPoPregledu entity);

    @Mappings({
            @Mapping(target = "sifraPregleda", source="api.sifra_pregleda"),
            @Mapping(target = "oznakaBolesti", source="api.oznaka_bolesti"),
            @Mapping(target = "nazivBolesti", source="api.naziv_bolesti")
    })
    BolestiPoPregledu apiToEntity(BolestiPoPregleduModel api);

    Collection<BolestiPoPregleduModel> entityListToApiList(Collection<BolestiPoPregledu> entity);
}
