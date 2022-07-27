package agri.persistance.faktura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface FakturaRepository extends JpaRepository<Faktura,Integer> {
    Collection<Faktura> findByNarudzbinaId(int narudzbinaId);
    
    @Query(value = "select count(*) "
    		+ "from faktura join uplata on (faktura.id=uplata.faktura) where faktura.id = ?1", nativeQuery = true)
	Integer brojUplata(Integer fakturaId);
}
