package agri.persistance.uplata;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UplataRepository extends JpaRepository<Uplata, Integer> {
    Uplata findByFakturaId(int fakturaId);
}
