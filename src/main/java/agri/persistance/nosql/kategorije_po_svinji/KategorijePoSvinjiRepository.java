package agri.persistance.nosql.kategorije_po_svinji;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KategorijePoSvinjiRepository extends CassandraRepository<KategorijePoSvinji, String> {
	List<KategorijePoSvinji> findAllByTetovirBrojSvinje (String tetovir_broj_svinje);
}
