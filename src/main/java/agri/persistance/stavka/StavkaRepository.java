package agri.persistance.stavka;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StavkaRepository extends JpaRepository<Stavka, Integer> {
    Collection<Stavka> findByNarudzbinaId(int narudzbinaId);
    Collection<Stavka> findByFakturaId(int faktturaId);
}
