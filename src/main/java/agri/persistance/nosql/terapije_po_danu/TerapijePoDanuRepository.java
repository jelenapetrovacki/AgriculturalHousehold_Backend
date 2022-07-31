package agri.persistance.nosql.terapije_po_danu;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TerapijePoDanuRepository extends CassandraRepository<TerapijePoDanu, Integer>{

	Collection<TerapijePoDanu> 
		findByGodinaAndDatumDoGreaterThanEqual(Integer god, LocalDate danasnji_datum);
}



