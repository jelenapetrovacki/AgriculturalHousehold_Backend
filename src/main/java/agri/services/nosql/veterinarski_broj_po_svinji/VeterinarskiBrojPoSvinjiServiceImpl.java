package agri.services.nosql.veterinarski_broj_po_svinji;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Collection;

import agri.persistance.nosql.svinja.SvinjaRepository;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.*;
import com.datastax.oss.driver.api.querybuilder.update.UpdateStart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import agri.api.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinjiService;
import agri.api.nosql.veterinarski_broj_po_svinji.VetrinarskiBrojPoSvinjiModel;
import agri.persistance.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinjiRepository;

import static com.datastax.oss.driver.api.querybuilder.QueryBuilder.literal;
import static com.datastax.oss.driver.api.querybuilder.QueryBuilder.update;


@RestController
@CrossOrigin
public class VeterinarskiBrojPoSvinjiServiceImpl implements VeterinarskiBrojPoSvinjiService{

	@Autowired
    private VeterinarskiBrojPoSvinjiRepository veterinarskiBrojPoSvinjiRepository;

	@Autowired
	private SvinjaRepository svinjaRepository;

    @Autowired
    private VeterinarskiBrojPoSvinjiMapper mapper;


	@Override
	public Collection<VetrinarskiBrojPoSvinjiModel> getArhivaVeterinarskogBroja(String tetovir_broj_svinje) {
		return mapper.entityListToApiList(veterinarskiBrojPoSvinjiRepository.findAllByTetovirBrojSvinje(tetovir_broj_svinje));
	}

	@Override
	public void postVeterinarskogBroja(VetrinarskiBrojPoSvinjiModel vetrinarskiBrojPoSvinjiModel,
									   String stari_veterinarski_broj) {
		try (CqlSession session = CqlSession.builder()
				.withCloudSecureConnectBundle(Paths.get("C:/Users/user/Downloads/secure-connect-poljoprivrednogazdinstvonosql.zip"))
				.withAuthCredentials("uyOkDQvDuaBUTcuCiOCAsETu","hwkXf5Q-QqtqKAEi4tYpc7cjUa26S9Ual9fczmx7CK8M2YZtwEnIdJDUy.HxaKAw7Uh5GEYZt7y9zdmso4lrRcL4SW66ZfEs1++A_TDUtx+HAWLbsAHODke.-Eb2Jqgg")
				.withKeyspace("farma_svinja")
				.build()){

			//insert veterinarskog broja
			BoundStatement insertVeterinarskiBroj = this.getVetBrInsertStatement(session, vetrinarskiBrojPoSvinjiModel);
			//update veterinarskog broja
			BoundStatement updateVeterinarskiBroj = this.getVetBrUpdateStatement(session, vetrinarskiBrojPoSvinjiModel, stari_veterinarski_broj);
			//update svinje
			BoundStatement updateSvinje = this.getSvinjaUpdateStatement(session, vetrinarskiBrojPoSvinjiModel, stari_veterinarski_broj);

			//kreiranje batch fajla
			BatchStatement batch = BatchStatement.newInstance(DefaultBatchType.LOGGED,
					insertVeterinarskiBroj, updateVeterinarskiBroj, updateSvinje);

			session.execute(batch);

		};

	}

	BoundStatement getVetBrInsertStatement(CqlSession session, VetrinarskiBrojPoSvinjiModel vps) {
		String cqlQuery1 = "insert into veterinarski_broj_po_svinji (tetovir_broj_svinje,datum_od, veterinarski_broj, " +
				"datum_do, veterinar) values (:tetovir_broj_svinje, :datum_od, :veterinarski_broj, null," +
				" {ime: :ime, prezime: :prezime, ustanova: :ust, broj_licence: :ust, kontakt: :kon});";


		PreparedStatement preparedInsertStatement = session.prepare(cqlQuery1);

		return preparedInsertStatement.bind(
				vps.getTetovir_broj_svinje(),
				LocalDate.now(),
				vps.getVeterinarski_broj(),
				vps.getVeterinar().getIme(),
				vps.getVeterinar().getPrezime(),
				vps.getVeterinar().getUstanova(),
				vps.getVeterinar().getBroj_licence(),
				vps.getVeterinar().getKontakt());
	}

	private BoundStatement getVetBrUpdateStatement(CqlSession session, VetrinarskiBrojPoSvinjiModel vetrinarskiBrojPoSvinjiModel, String stariVeterinarskiBroj) {
		UpdateStart update = (UpdateStart) update("veterinarski_broj_po_svinji")
				.setColumn("datum_do", literal(LocalDate.now()))
				.whereColumn("tetovir_broj_svinje").isEqualTo(literal(vetrinarskiBrojPoSvinjiModel.getTetovir_broj_svinje()))
				.whereColumn("veterinarski_broj").isEqualTo(literal(stariVeterinarskiBroj));

		PreparedStatement preparedUpdateStatement = session.prepare(update.toString());

		return preparedUpdateStatement.bind();
	}

	private BoundStatement getSvinjaUpdateStatement(CqlSession session, VetrinarskiBrojPoSvinjiModel vetrinarskiBrojPoSvinjiModel, String stari_veterinarski_broj) {
		UpdateStart update = (UpdateStart) update("svinja")
				.setColumn("aktuelni_veterinarski_broj", literal(vetrinarskiBrojPoSvinjiModel.getVeterinarski_broj()))
				.whereColumn("tetovir_broj_svinje").isEqualTo(literal(vetrinarskiBrojPoSvinjiModel.getTetovir_broj_svinje()));

		PreparedStatement preparedUpdateSvinjaStatement = session.prepare(update.toString());

		return preparedUpdateSvinjaStatement.bind();
	}




}
