package volunteering.SPP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import volunteering.SPP.DBEntity.Composition;

@Repository
public interface CompositionRepository extends JpaRepository<Composition, Long> {
    // You can define custom query methods here if needed.
}

