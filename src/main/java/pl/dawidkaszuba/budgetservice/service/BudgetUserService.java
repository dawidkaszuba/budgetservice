package pl.dawidkaszuba.budgetservice.service;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;

import java.util.List;

@Service
public interface BudgetUserService {
    BudgetUser getBudgetUserByUserName(String userName);

    List<BudgetUser> getAllUsers();
}
