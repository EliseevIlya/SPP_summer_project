package volunteering.SPP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import volunteering.SPP.DBEntity.DBUser;

@Repository
public interface UserRepository extends JpaRepository<DBUser, Long> {
    // You can define custom query methods here if needed.
}

