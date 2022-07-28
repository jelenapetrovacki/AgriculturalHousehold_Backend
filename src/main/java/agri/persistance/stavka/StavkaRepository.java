package agri.persistance.stavka;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface StavkaRepository extends JpaRepository<Stavka, Integer> {
    Collection<Stavka> findByNarudzbinaId(int narudzbinaId);
    Collection<Stavka> findByFakturaId(int faktturaId);

    @Query(value = "select * "
            + "from stavka where narudzbina= ?1 and faktura is null", nativeQuery = true)
    Collection<Stavka> findNefakturisaneStavkeNarudzbine(int narudzbinaId);
}
