package volunteering.SPP.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import volunteering.SPP.DBEntity.AccountType;
import volunteering.SPP.Repository.AccountTypeRepository;

import java.util.List;

@Service
public class AccountTypeService {
    @Autowired
    private AccountTypeRepository accountTypeRepository;
    @Autowired
        public AccountTypeService(AccountTypeRepository accountTypeRepository){
        this.accountTypeRepository=accountTypeRepository;
    }
    public List<AccountType> getAllAccType(){
        System.out.println(accountTypeRepository.findAll());
        return accountTypeRepository.findAll();
    }
}
