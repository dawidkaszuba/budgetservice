package pl.dawidkaszuba.budgetservice.service.impl;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;
import pl.dawidkaszuba.budgetservice.repository.BudgetUserRepository;
import pl.dawidkaszuba.budgetservice.service.BudgetUserService;

import java.util.List;
import java.util.Optional;

@Service
public class BudgetUserServiceImpl implements BudgetUserService {

    private final BudgetUserRepository budgetUserRepository;

    public BudgetUserServiceImpl(BudgetUserRepository budgetUserRepository) {
        this.budgetUserRepository = budgetUserRepository;
    }

    @Override
    public BudgetUser getOrCreateBudgetUserByUserName(String userName) {
        Optional<BudgetUser> optionalUser = budgetUserRepository.findByUserName(userName);
        if(budgetUserRepository.findByUserName(userName).isPresent()) {
            return optionalUser.get();
        } else {
            BudgetUser newUser = new BudgetUser(userName);
            return budgetUserRepository.save(newUser);
        }
    }

    @Override
    public List<BudgetUser> getAllUsers() {
        return budgetUserRepository.findAll();
    }
}
