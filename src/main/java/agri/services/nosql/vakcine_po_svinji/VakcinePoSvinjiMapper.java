package agri.services.nosql.vakcine_po_svinji;

import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import agri.persistance.nosql.vakcine_po_svinji.VakcinePoSvinji;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface VakcinePoSvinjiMapper {

    @Mappings({
            @Mapping(target = "tetovir_broj_svinje", source="entity.tetovirBrojSvinje"),
            @Mapping(target = "sifra_davanja_vakcine", source="entity.sifraDavanjaVakcine"),
            @Mapping(target = "datum_davanja", source="entity.datumDavanja"),
            @Mapping(target = "sifra_vakcine", source="entity.sifraVakcine"),
            @Mapping(target = "kolicina_doze_vakcine", source="entity.kolicinaDozeVakcine"),
            @Mapping(target = "naziv_tipa_vakcine", source="entity.nazivTipaVakcine"),
            @Mapping(target = "opis_tipa_vakcine", source="entity.opisTipaVakcine")
    })
    VakcinePoSvinjiModel entityToApi(VakcinePoSvinji entity);

    @Mappings({
            @Mapping(target = "tetovirBrojSvinje", source="api.tetovir_broj_svinje"),
            @Mapping(target = "sifraDavanjaVakcine", source="api.sifra_davanja_vakcine"),
            @Mapping(target = "datumDavanja", source="api.datum_davanja"),
            @Mapping(target = "sifraVakcine", source="api.sifra_vakcine"),
            @Mapping(target = "kolicinaDozeVakcine", source="api.kolicina_doze_vakcine"),
            @Mapping(target = "nazivTipaVakcine", source="api.naziv_tipa_vakcine"),
            @Mapping(target = "opisTipaVakcine", source="api.opis_tipa_vakcine")
    })
    VakcinePoSvinji apiToEntity(VakcinePoSvinjiModel api);

    Collection<VakcinePoSvinjiModel> entityListToApiList(Collection<VakcinePoSvinji> entity);
}
