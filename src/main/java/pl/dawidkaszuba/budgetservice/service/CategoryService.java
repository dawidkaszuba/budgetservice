package pl.dawidkaszuba.budgetservice.service;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.budgetservice.model.Category;
import pl.dawidkaszuba.budgetservice.model.CategoryType;

import java.util.List;
import java.util.Optional;

@Service
public interface CategoryService {
    List<Category> getAllCategories();

    List<Category> findByCategoryType(CategoryType type);

    List<Category> getAllCategoriesByBudgetUser(String userName);

    Category save(Category category);

    Optional<Category> getCategoryById(Long id);

    Category updateCategory(Category category);
}
