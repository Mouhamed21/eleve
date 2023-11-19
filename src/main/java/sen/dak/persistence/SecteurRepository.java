package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.Secteur;
@Repository
public interface SecteurRepository extends JpaRepository<Secteur, Long> {

}
