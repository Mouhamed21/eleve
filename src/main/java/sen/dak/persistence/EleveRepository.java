package sen.dak.persistence;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sen.dak.entities.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {

    @Query(value = "select e from Eleve e where e.classe.id=:classeId")
    public List<Eleve> findByClasse(@Param("classeId") Long classeId);

    @Query(value = "select count(e)  from Eleve e where e.classe.id=:classeId")
    public int findEffectifClasse(@Param("classeId") Long classeId);
}
