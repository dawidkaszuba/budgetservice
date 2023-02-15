package pl.dawidkaszuba.budgetservice.service;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;
import pl.dawidkaszuba.budgetservice.model.Expense;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public interface ExpenseService {
    List<Expense> getAllExpensesByBudgetUser(String userName);

    Expense save(Expense expense);

    Expense updateExpense(Expense expense);

    Optional<Expense> getExpenseById(Long id);

    Double getSumOfAllExpensesByUserAndTimeBetween(BudgetUser userId, LocalDateTime startDateTime, LocalDateTime endDateTime);
}
