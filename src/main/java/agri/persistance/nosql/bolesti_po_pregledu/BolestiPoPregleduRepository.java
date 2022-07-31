package agri.persistance.nosql.bolesti_po_pregledu;


import agri.api.nosql.bolesti_po_pregledu.BolestiPoPregleduModel;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BolestiPoPregleduRepository extends CassandraRepository<BolestiPoPregledu, Integer> {
    List<BolestiPoPregledu> findAllBySifraPregleda (int sifraPregleda);
}
