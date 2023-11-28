package sen.dak.persistence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Long> {
}
