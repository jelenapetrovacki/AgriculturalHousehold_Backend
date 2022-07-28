package agri.persistance.nosql.veterinarski_broj_po_svinji;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarskiBrojPoSvinjiRepository extends CassandraRepository<VeterinarskiBrojPoSvinji, String> {
}
