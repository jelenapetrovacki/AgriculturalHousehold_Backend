package agri.services.klijent;

import java.util.Collection;

import org.mapstruct.Mapper;

import agri.api.klijent.KlijentModel;
import agri.persistance.Klijent;

@Mapper(componentModel = "spring")
public interface KlijentMapper {

	KlijentModel entityToApi(Klijent entity);
	Klijent apiToEntity(KlijentModel api);
	
	Collection<KlijentModel> entityListToApiList(Collection<Klijent> entity);
}
