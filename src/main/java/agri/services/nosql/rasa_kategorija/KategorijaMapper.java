package agri.services.nosql.rasa_kategorija;

import agri.api.nosql.rasa_kategorija.KategorijaModel;
import agri.api.nosql.svinja.SvinjaModel;
import agri.persistance.nosql.rasa_kategorija.Kategorija;
import agri.persistance.nosql.svinja.Svinja;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface KategorijaMapper {

    @Mappings({
            @Mapping(target = "sifra_kategorije", source="entity.sifraKategorije"),
            @Mapping(target = "naziv_kategorije", source="entity.nazivKategorije"),
            @Mapping(target = "pol_svinje", source="entity.polSvinje"),
            @Mapping(target = "rasno_poreklo", source="entity.rasnoPoreklo"),
            @Mapping(target = "masa_trupa", source="entity.masaTrupa")})
    KategorijaModel entityToApi(Kategorija entity);

    @Mappings({
            @Mapping(target = "sifraKategorije", source="api.sifra_kategorije"),
            @Mapping(target = "nazivKategorije", source="api.naziv_kategorije"),
            @Mapping(target = "polSvinje", source="api.pol_svinje"),
            @Mapping(target = "rasnoPoreklo", source="api.rasno_poreklo"),
            @Mapping(target = "masaTrupa", source="api.masa_trupa")
    })
    Kategorija apiToEntity(KategorijaModel api);

    Collection<KategorijaModel> entityListToApiList(Collection<Kategorija> entity);
}
