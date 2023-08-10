package volunteering.SPP.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import volunteering.SPP.DBEntity.AccountType;
import volunteering.SPP.Services.AccountTypeService;

import java.util.List;

@Controller
public class AccTypeController {
    @Autowired
    private AccountTypeService accountTypeService;
    @Autowired
    public  AccTypeController(AccountTypeService accountTypeService){
        this.accountTypeService=accountTypeService;
    }
    @GetMapping("/accType")
    public String getAllAccType(Model model){
        List<AccountType> accountTypes=accountTypeService.getAllAccType();
        model.addAttribute("accountTypes",accountTypes);
        return "accType";
    }

}
