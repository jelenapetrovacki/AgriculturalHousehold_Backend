package agri.services.nosql.veterinarski_broj_po_svinji;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import agri.persistance.nosql.svinja.Svinja;
import agri.persistance.nosql.svinja.SvinjaRepository;
import agri.persistance.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinji;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.core.CassandraBatchOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.mapping.CassandraPersistentEntity;
import org.springframework.data.cassandra.repository.query.CassandraEntityInformation;
import org.springframework.data.cassandra.repository.support.MappingCassandraEntityInformation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import agri.api.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinjiService;
import agri.api.nosql.veterinarski_broj_po_svinji.VetrinarskiBrojPoSvinjiModel;
import agri.persistance.nosql.veterinarski_broj_po_svinji.VeterinarskiBrojPoSvinjiRepository;

@RestController
@CrossOrigin
public class VeterinarskiBrojPoSvinjiServiceImpl implements VeterinarskiBrojPoSvinjiService{

	@Autowired
    private VeterinarskiBrojPoSvinjiRepository veterinarskiBrojPoSvinjiRepository;

	@Autowired
	private CassandraTemplate cassandraTemplate;
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
		System.out.println("bla pre");
		VeterinarskiBrojPoSvinji veterinarskiBrojPoSvinji = mapper.apiToEntity(vetrinarskiBrojPoSvinjiModel);
		System.out.println("bla posle");
		insert(veterinarskiBrojPoSvinji, stari_veterinarski_broj);
	}

	public void insert(VeterinarskiBrojPoSvinji veterinarskiBrojPoSvinji, String stari_veterinarski_broj) {
		final CassandraBatchOperations batchOps = cassandraTemplate.batchOps();
		updateSvinja(veterinarskiBrojPoSvinji.getTetovirBrojSvinje(), veterinarskiBrojPoSvinji.getVeterinarskiBroj(),batchOps);
		System.out.println("bla posle svega");
		//updateArhiva(veterinarskiBrojPoSvinji.getTetovirBrojSvinje(),stari_veterinarski_broj, batchOps);
		System.out.println("bla posle update arhiva");
		//batchOps.insert(veterinarskiBrojPoSvinji);
		batchOps.execute();
	}

	private void updateArhiva(String tetovirBrojSvinje, String stariVeterinarskiBroj, CassandraBatchOperations batchOps) {
		VeterinarskiBrojPoSvinji stari
				= veterinarskiBrojPoSvinjiRepository.findOneByTetovirBrojSvinjeAndVeterinarskiBroj(tetovirBrojSvinje, stariVeterinarskiBroj);
		stari.setDatum_do(LocalDate.now());
		batchOps.update(stari);
	}

	private void updateSvinja(String tetovirBrojSvinje, String noviVeterinarskiBroj, CassandraBatchOperations batchOps) {
		Svinja svinja = svinjaRepository.findByTetovirBrojSvinje(tetovirBrojSvinje);
		svinja.setAktuelni_veterinarski_broj(noviVeterinarskiBroj);
		batchOps.update(svinja);
	}

}
