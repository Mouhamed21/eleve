package sen.dak.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import sen.dak.entities.Region;

public interface RegionRepository extends JpaRepository<Region, Long> {
}
