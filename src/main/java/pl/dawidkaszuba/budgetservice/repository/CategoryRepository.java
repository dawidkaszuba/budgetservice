package pl.dawidkaszuba.budgetservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;
import pl.dawidkaszuba.budgetservice.model.Category;
import pl.dawidkaszuba.budgetservice.model.CategoryType;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByCategoryType(CategoryType type);

    List<Category> findAllByBudgetUser(BudgetUser budgetUser);
}

