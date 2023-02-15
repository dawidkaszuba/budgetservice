package pl.dawidkaszuba.budgetservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;

import java.util.Optional;

public interface BudgetUserRepository extends JpaRepository<BudgetUser, Long> {
    Optional<BudgetUser> findByUserName(String username);
}
