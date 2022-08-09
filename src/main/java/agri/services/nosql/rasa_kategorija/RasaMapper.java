package agri.services.nosql.rasa_kategorija;

import agri.api.nosql.rasa_kategorija.RasaModel;
import agri.api.nosql.svinja.SvinjaModel;
import agri.persistance.nosql.rasa_kategorija.Rasa;
import agri.persistance.nosql.svinja.Svinja;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface RasaMapper {

    @Mappings({
            @Mapping(target = "oznaka_rase", source="entity.oznakaRase"),
            @Mapping(target = "naziv_rase", source="entity.nazivRase"),
            @Mapping(target = "alternativno_ime", source="entity.alternativnoIme"),
            @Mapping(target = "zemlja_porekla", source="entity.zemljaPorekla")})
    RasaModel entityToApi(Rasa entity);

    @Mappings({
            @Mapping(target = "oznakaRase", source="api.oznaka_rase"),
            @Mapping(target = "nazivRase", source="api.naziv_rase"),
            @Mapping(target = "alternativnoIme", source="api.alternativno_ime"),
            @Mapping(target = "zemljaPorekla", source="api.zemlja_porekla"),

    })
    Rasa apiToEntity(RasaModel api);

    Collection<RasaModel> entityListToApiList(Collection<Rasa> entity);
}
