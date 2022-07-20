package agri.persistance.klijent;

import org.springframework.data.jpa.repository.JpaRepository;

import agri.persistance.Klijent;

public interface KlijentRepository extends JpaRepository<Klijent, Integer> {
}
