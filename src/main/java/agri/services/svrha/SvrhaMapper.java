package agri.services.svrha;

import agri.api.svrha.SvrhaModel;
import agri.persistance.svrha.Svrha;
import org.mapstruct.Mapper;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface SvrhaMapper {

    SvrhaModel entityToApi(Svrha entity);
    Svrha apiToEntity(SvrhaModel api);

    Collection<SvrhaModel> entityListToApiList(Collection<Svrha> entity);
}
