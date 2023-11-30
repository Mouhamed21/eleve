package sen.dak.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.ResponsableFormation;

@Repository
public interface ResponsableFormationRepository extends JpaRepository<ResponsableFormation, Long> {

}
