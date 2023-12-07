package sen.dak.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import sen.dak.entities.Observation;

public interface ObservationRepository extends JpaRepository<Observation, Long> {
}
