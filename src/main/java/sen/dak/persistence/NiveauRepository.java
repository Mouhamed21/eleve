package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Niveau;

@Repository
public interface NiveauRepository extends JpaRepository<Niveau, Long> {
}