package volunteering.SPP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import volunteering.SPP.DBEntity.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // You can define custom query methods here if needed.
}

