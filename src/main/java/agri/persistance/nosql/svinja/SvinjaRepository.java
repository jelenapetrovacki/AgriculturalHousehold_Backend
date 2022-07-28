package agri.persistance.nosql.svinja;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SvinjaRepository extends CassandraRepository<Svinja, String> {


}
