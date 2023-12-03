package sen.dak.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {


}
