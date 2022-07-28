package agri.persistance.nosql.svinje_po_rasi;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Svinje_po_rasi_Repository extends CassandraRepository <Svinje_po_rasi, String> {

}
