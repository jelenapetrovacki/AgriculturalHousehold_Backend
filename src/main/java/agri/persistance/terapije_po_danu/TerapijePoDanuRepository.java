package agri.persistance.terapije_po_danu;

import java.time.LocalDate;
import java.util.Collection;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface TerapijePoDanuRepository extends CassandraRepository<TerapijePoDanu, Integer>{
	//AndDatumDoLessThanEqual ne moze jer nije deo kljuca
	Collection<TerapijePoDanu> findBySifraTerapijeAndGodinaAndDatumOdLessThanEqual(UUID sifraTerapije, Integer god, LocalDate datum_od);
}
