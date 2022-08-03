package agri.persistance.nosql.veterinar;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeterinarRepository extends CassandraRepository<Veterinar, String> {
}
