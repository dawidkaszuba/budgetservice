package pl.dawidkaszuba.budgetservice.service;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;
import pl.dawidkaszuba.budgetservice.model.Income;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public interface IncomeService {
    List<Income> getAllIncomesByUser(String userName);
    Optional<Income> findById(Long id);

    Income save(Income expense);

    Optional<Income> getIncomeById(Long id);

    Income updateIncome(Income income);

    Double getSumOfAllIncomesByUserAndTimeBetween(BudgetUser budgetUser, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
