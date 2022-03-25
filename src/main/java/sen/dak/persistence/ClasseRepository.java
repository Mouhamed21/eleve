package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import sen.dak.entities.Classe;

public interface ClasseRepository extends JpaRepository<Classe, Long> {

}
