package agri.persistance.faktura;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface FakturaRepository extends JpaRepository<Faktura,Integer> {
    Collection<Faktura> findByNarudzbinaId(int narudzbinaId);
}
