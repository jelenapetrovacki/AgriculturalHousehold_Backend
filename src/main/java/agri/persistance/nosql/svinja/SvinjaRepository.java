package agri.persistance.nosql.svinja;

import agri.api.nosql.svinja.SvinjaModel;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;


@Repository
public interface SvinjaRepository extends CassandraRepository<Svinja, String> {
        Svinja findByTetovirBrojSvinje(String tetovirBrojSvinje);
        Collection<Svinja> findAllByRasa(String rasa);
        Collection<Svinja> findAllByKategorija(String kategorija);

}
