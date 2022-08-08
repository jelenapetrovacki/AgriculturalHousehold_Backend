package agri.services.nosql.vakcine_po_svinji;

import agri.api.nosql.vakcine_po_svinji.VakcinaModel;
import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiModel;
import agri.api.nosql.vakcine_po_svinji.VakcinePoSvinjiService;
import agri.persistance.nosql.svinja_broj_vakcina.SvinjaBrojVakcinaRepository;
import agri.persistance.nosql.vakcine_po_svinji.VakcinaRepository;
import agri.persistance.nosql.vakcine_po_svinji.VakcinePoSvinjiRepository;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import com.datastax.oss.driver.api.core.uuid.Uuids;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collection;


@RestController
@CrossOrigin
public class VakcinePoSvinjiServiceImpl implements VakcinePoSvinjiService {

    @Autowired
    private VakcinePoSvinjiRepository vakcinePoSvinjiRepository;
    @Autowired
    private VakcinaRepository vakcinaRepository;

    @Autowired
    private SvinjaBrojVakcinaRepository svinjaBrojVakcinaRepository;

    @Autowired
    private VakcinePoSvinjiMapper vakcinePoSvinjiMapper;

    @Autowired
    private VakcinaMapper vakcinaMapper;


    @Override
    public Collection<VakcinePoSvinjiModel> getVakcinePoSvinji(String tetovir_broj_svinje) {
        return vakcinePoSvinjiMapper.entityListToApiList(vakcinePoSvinjiRepository.findAllByTetovirBrojSvinje(tetovir_broj_svinje));
    }

    @Override
    public Collection<VakcinaModel> getAllVakcine() {
        return vakcinaMapper.entityListToApiList(vakcinaRepository.findAll());
    }

    @Override
    public void postVakcinePoSvinji(VakcinePoSvinjiModel vakcinePoSvinjiModel) {

        try (CqlSession session = CqlSession.builder()
                .withCloudSecureConnectBundle(Paths.get("C:/Users/user/Downloads/secure-connect-poljoprivrednogazdinstvonosql.zip"))
                .withAuthCredentials("uyOkDQvDuaBUTcuCiOCAsETu", "hwkXf5Q-QqtqKAEi4tYpc7cjUa26S9Ual9fczmx7CK8M2YZtwEnIdJDUy.HxaKAw7Uh5GEYZt7y9zdmso4lrRcL4SW66ZfEs1++A_TDUtx+HAWLbsAHODke.-Eb2Jqgg")
                .withKeyspace("farma_svinja")
                .build()) {

            ResultSet resultSet;
            BatchStatement batch;

            //update svinja broj vakcina i kreiranje batch fajla za update countera
            BoundStatement updateSvinjaBrojVakcina = this.getBrojVakUpdateStatement(session, vakcinePoSvinjiModel);
            batch = BatchStatement.newInstance(DefaultBatchType.UNLOGGED,
                    updateSvinjaBrojVakcina);

            //provera uspesnosti
            resultSet = session.execute(batch);
            if (resultSet.wasApplied()) {

                //insert vakcine po svinji i kreiranje batch fajla za insert
                BoundStatement insertVakcinePoSvinji = this.getVakcineInsertStatement(session, vakcinePoSvinjiModel);
                batch = BatchStatement.newInstance(DefaultBatchType.LOGGED,
                        insertVakcinePoSvinji);

                resultSet = session.execute(batch);
                if (resultSet.wasApplied()) {
                    System.out.println("Success");
                } else {
                    //undo incrementa ako nije uspesan insert
                    svinjaBrojVakcinaRepository.undoUpdateBrojVakcina(vakcinePoSvinjiModel.getTetovir_broj_svinje());
                }
            }

        }
    }


    private BoundStatement getVakcineInsertStatement(CqlSession session, VakcinePoSvinjiModel vakcinePoSvinjiModel) {

        String cqlQuery1 = "insert into vakcine_po_svinji (tetovir_broj_svinje, sifra_davanja_vakcine, " +
                "datum_davanja, sifra_vakcine, kolicina_doze_vakcine, naziv_tipa_vakcine, " +
                "opis_tipa_vakcine, veterinar) values (:tetovir_broj_svinje, :sifra_davanja_vakcine, " +
                ":datum_davanja, :sifra_vakcine, :kolicina_doze_vakcine, :naziv_tipa_vakcine, " +
                ":opis_tipa_vakcine," + " {ime: :ime, prezime: :prezime, ustanova: :ust, broj_licence: :ust, kontakt: :kon});";

        PreparedStatement preparedInsertStatement = session.prepare(cqlQuery1);

        return preparedInsertStatement.bind(
                vakcinePoSvinjiModel.getTetovir_broj_svinje(),
                Uuids.timeBased(),
                LocalDate.now(),
                vakcinePoSvinjiModel.getSifra_vakcine(),
                vakcinePoSvinjiModel.getKolicina_doze_vakcine(),
                vakcinePoSvinjiModel.getNaziv_tipa_vakcine(),
                vakcinePoSvinjiModel.getOpis_tipa_vakcine(),
                vakcinePoSvinjiModel.getVeterinar().getIme(),
                vakcinePoSvinjiModel.getVeterinar().getPrezime(),
                vakcinePoSvinjiModel.getVeterinar().getUstanova(),
                vakcinePoSvinjiModel.getVeterinar().getBroj_licence(),
                vakcinePoSvinjiModel.getVeterinar().getKontakt());
    }

    private BoundStatement getBrojVakUpdateStatement(CqlSession session, VakcinePoSvinjiModel vakcinePoSvinjiModel) {
        String cqlQuery1 = "update svinja_broj_vakcina "
                + "set broj_vakcina=broj_vakcina+1 where tetovir_broj_svinje=:tetovir_broj_svinje";

        PreparedStatement preparedUpdateStatement = session.prepare(cqlQuery1);
        return preparedUpdateStatement.bind(vakcinePoSvinjiModel.getTetovir_broj_svinje());
    }
}
