package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Metier;
@Repository
public interface MetierRepository extends JpaRepository<Metier, Long> {
}
