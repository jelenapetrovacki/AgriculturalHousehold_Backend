package agri.persistance.nosql.rasa_kategorija;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorijaRepository extends CassandraRepository<Kategorija, Integer> {
}
