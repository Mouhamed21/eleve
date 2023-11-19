package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sen.dak.entities.EntrepriseFormatrice;

@Repository
public interface EntrepriseFormatriceRepository extends JpaRepository<EntrepriseFormatrice, Long> {

}
