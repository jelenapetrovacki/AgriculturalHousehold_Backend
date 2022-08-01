package agri.persistance.nosql.veterinarski_broj_po_svinji;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface VeterinarskiBrojPoSvinjiRepository extends CassandraRepository<VeterinarskiBrojPoSvinji, String> {
	List<VeterinarskiBrojPoSvinji> findAllByTetovirBrojSvinje (String tetovir_broj_svinje);

	VeterinarskiBrojPoSvinji findOneByTetovirBrojSvinjeAndVeterinarskiBroj (String tetovir_broj_svinje, String veterinarski_broj);
}
