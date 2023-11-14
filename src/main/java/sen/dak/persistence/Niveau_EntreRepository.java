package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Niveau_Entre;

@Repository
public interface Niveau_EntreRepository extends JpaRepository<Niveau_Entre, Long> {
}
