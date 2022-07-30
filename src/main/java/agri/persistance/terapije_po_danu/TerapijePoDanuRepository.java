package agri.persistance.terapije_po_danu;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TerapijePoDanuRepository extends CassandraRepository<TerapijePoDanu, Integer>{

	Collection<TerapijePoDanu> 
		findByGodinaAndDatumDoGreaterThanEqual(Integer god, LocalDate danasnji_datum);
}



