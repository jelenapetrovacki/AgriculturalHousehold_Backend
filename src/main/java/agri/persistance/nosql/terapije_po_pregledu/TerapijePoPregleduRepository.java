package agri.persistance.nosql.terapije_po_pregledu;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TerapijePoPregleduRepository extends CassandraRepository<TerapijePoPregledu, Integer> {

    List<TerapijePoPregledu> findAllBySifraPregleda (int sifra_pregleda);
}
