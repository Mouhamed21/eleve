package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Apprenant;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
}
