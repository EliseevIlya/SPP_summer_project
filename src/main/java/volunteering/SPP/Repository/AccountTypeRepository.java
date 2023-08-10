package volunteering.SPP.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import volunteering.SPP.DBEntity.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
    // You can define custom query methods here if needed.
}

