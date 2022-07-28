package agri.persistance.nosql.leglo;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LegloRepository extends CassandraRepository<Leglo, String> {
}
