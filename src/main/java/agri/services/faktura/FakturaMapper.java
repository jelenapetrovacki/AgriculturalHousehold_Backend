package agri.services.faktura;

import agri.api.faktura.FakturaModel;
import agri.api.tip_proizvoda.TipProizvodaModel;
import agri.persistance.faktura.Faktura;
import agri.persistance.tip_proizvoda.TipProizvoda;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface FakturaMapper {

    @Mappings({
            @Mapping(target = "datum_izdavanja", source="entity.datumIzdavanja")
    })
    FakturaModel entityToApi(Faktura entity);

    @Mappings({
            @Mapping(target = "datumIzdavanja", source="api.datum_izdavanja")
    })
    Faktura apiToEntity(FakturaModel api);


    Collection<FakturaModel> entityListToApiList(Collection<Faktura> entity);
}
