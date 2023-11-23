package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Filiere;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Long> {
}
