package agri.persistance.nosql.kategorije_po_svinji;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorijePoSvinjiRepository extends CassandraRepository<KategorijePoSvinji, String> {
}
