package agri.persistance.nosql.vakcine_po_svinji;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VakcinePoSvinjiRepository extends CassandraRepository<VakcinePoSvinji, String> {
    List<VakcinePoSvinji> findAllByTetovirBrojSvinje (String tetovir_broj_svinje);
}
