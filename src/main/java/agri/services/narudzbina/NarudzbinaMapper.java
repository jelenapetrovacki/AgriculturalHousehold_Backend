package agri.services.narudzbina;

import agri.api.narudzbina.NarudzbinaModel;
import agri.persistance.narudzbina.Narudzbina;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface NarudzbinaMapper {
    NarudzbinaModel entityToApi(Narudzbina entity);
    Narudzbina apiToEntity(NarudzbinaModel api);

    Collection<NarudzbinaModel> entityListToApiList(Collection<Narudzbina> entity);
}
