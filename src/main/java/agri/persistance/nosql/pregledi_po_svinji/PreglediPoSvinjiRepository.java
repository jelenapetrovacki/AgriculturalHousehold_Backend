package agri.persistance.nosql.pregledi_po_svinji;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreglediPoSvinjiRepository extends CassandraRepository<PreglediPoSvinji, String> {
    List<PreglediPoSvinji> findAllByTetovirBrojSvinje (String tetovir_broj_svinje);
}
