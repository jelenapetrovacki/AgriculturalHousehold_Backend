package agri.services.tip_proizvoda;

import agri.api.tip_proizvoda.TipProizvodaModel;
import agri.persistance.tip_proizvoda.TipProizvoda;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface TipProizvodaMapper {

    @Mappings({
    	@Mapping(target = "naziv_tipa", source="entity.nazivTipa"),
            @Mapping(target = "jedinicna_cena", source="entity.jedinicnaCena")
    })
    TipProizvodaModel entityToApi(TipProizvoda entity);

    @Mappings({
    	 @Mapping(target = "nazivTipa", source="api.naziv_tipa"),
            @Mapping(target = "jedinicnaCena", source="api.jedinicna_cena")
    })
    TipProizvoda apiToEntity(TipProizvodaModel api);

    Collection<TipProizvodaModel> entityListToApiList(Collection<TipProizvoda> entity);
}
