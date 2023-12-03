package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.InspectionAcademie;

@Repository
public interface InspectionAcademieRepository extends JpaRepository<InspectionAcademie, Long> {
}
