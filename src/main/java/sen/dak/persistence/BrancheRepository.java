package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Branche;
@Repository
public interface BrancheRepository extends JpaRepository<Branche, Long> {
}
