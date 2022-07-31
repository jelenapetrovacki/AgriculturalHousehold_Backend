package agri.services.nosql.terapije_po_pregledu;

import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;
import agri.api.nosql.terapije_po_pregledu.TerapijePoPregleduModel;
import agri.persistance.nosql.bolesti_po_pregledu.BolestiPoPregledu;
import agri.persistance.nosql.terapije_po_pregledu.TerapijePoPregledu;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface TerapijePoPregleduMapper {

    @Mappings({
            @Mapping(target = "sifra_pregleda", source="entity.sifraPregleda"),
            @Mapping(target = "sifra_terapije", source="entity.sifraTerapije"),
            @Mapping(target = "datum_od", source="entity.datumOd"),
            @Mapping(target = "datum_do", source="entity.datumDo"),
            @Mapping(target = "dnevni_broj_davanja", source="entity.dnevniBrojDavanja")
    })
    TerapijePoPregleduModel entityToApi(TerapijePoPregledu entity);

    @Mappings({
            @Mapping(target = "sifraPregleda", source="api.sifra_pregleda"),
            @Mapping(target = "sifraTerapije", source="api.sifra_terapije"),
            @Mapping(target = "datumOd", source="api.datum_od"),
            @Mapping(target = "datumDo", source="api.datum_do"),
            @Mapping(target = "dnevniBrojDavanja", source="api.dnevni_broj_davanja")
    })
    TerapijePoPregledu apiToEntity(TerapijePoPregleduModel api);

    Collection<TerapijePoPregleduModel> entityListToApiList(Collection<TerapijePoPregledu> entity);
}
