package agri.services.stavka;

import agri.api.faktura.FakturaModel;
import agri.api.nacin_uplate.NacinUplateModel;
import agri.api.narudzbina.NarudzbinaModel;
import agri.api.stavka.StavkaModel;
import agri.api.tip_proizvoda.TipProizvodaModel;
import agri.persistance.nacin_uplate.NacinUplate;
import agri.persistance.stavka.Stavka;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.Collection;

@Mapper(componentModel = "spring")
public interface StavkaMapper {
    @Mappings({
            @Mapping(target = "jedinica_mere", source="entity.jedinicaMere"),
            @Mapping(target = "obracunata_cena", source="entity.obracunataCena"),
            @Mapping(target = "tip_proizvoda", source="entity.tipProizvoda"),
            @Mapping(target = "tip_proizvoda.naziv_tipa", source="entity.tipProizvoda.nazivTipa"),
            @Mapping(target = "tip_proizvoda.jedinicna_cena", source="entity.tipProizvoda.jedinicnaCena")
    })
    StavkaModel entityToApi(Stavka entity);

    @Mappings({
            @Mapping(target = "jedinicaMere", source="api.jedinica_mere"),
            @Mapping(target = "obracunataCena", source="api.obracunata_cena"),
            @Mapping(target = "tipProizvoda", source="api.tip_proizvoda"),
            @Mapping(target = "tipProizvoda.nazivTipa", source="api.tip_proizvoda.naziv_tipa"),
            @Mapping(target = "tipProizvoda.jedinicnaCena", source="api.tip_proizvoda.jedinicna_cena")
    })
    //mapiranje svega mora jasno
    Stavka apiToEntity(StavkaModel api);


    Collection<StavkaModel> entityListToApiList(Collection<Stavka> entity);
    Collection<Stavka> apiListToEntityList(Collection<StavkaModel> api);
}
