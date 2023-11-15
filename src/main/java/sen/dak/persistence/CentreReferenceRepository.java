package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.CentreReference;

@Repository
public interface CentreReferenceRepository extends JpaRepository<CentreReference, Long> {
}
