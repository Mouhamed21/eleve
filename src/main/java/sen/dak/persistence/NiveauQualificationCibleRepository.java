package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.NiveauQualificationCible;

@Repository
public interface NiveauQualificationCibleRepository extends JpaRepository<NiveauQualificationCible, Long> {
}
