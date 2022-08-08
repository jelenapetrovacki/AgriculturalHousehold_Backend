package agri.persistance.nosql.vakcine_po_svinji;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VakcinaRepository extends CassandraRepository<Vakcina, String> {
}
