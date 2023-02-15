package pl.dawidkaszuba.budgetservice.service.impl;

import org.springframework.stereotype.Service;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;
import pl.dawidkaszuba.budgetservice.model.Category;
import pl.dawidkaszuba.budgetservice.model.CategoryType;
import pl.dawidkaszuba.budgetservice.repository.CategoryRepository;
import pl.dawidkaszuba.budgetservice.service.BudgetUserService;
import pl.dawidkaszuba.budgetservice.service.CategoryService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    private final BudgetUserService budgetUserService;

    public CategoryServiceImpl(CategoryRepository categoryRepository, BudgetUserService budgetUserService) {
        this.categoryRepository = categoryRepository;
        this.budgetUserService = budgetUserService;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findByCategoryType(CategoryType type) {
        return categoryRepository.findByCategoryType(type);
    }

    @Override
    public List<Category> getAllCategoriesByBudgetUser(String userName) {
        BudgetUser budgetUser = budgetUserService.getBudgetUserByUserName(userName);
        return categoryRepository.findAllByBudgetUser(budgetUser);
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    @Override
    public Category updateCategory(Category category) {
        Category categoryInDb = categoryRepository.findById(category.getId()).get();
        categoryInDb.setCategoryType(category.getCategoryType());
        categoryInDb.setName(category.getName());
        categoryInDb.setBudgetUser(category.getBudgetUser());
        categoryRepository.save(categoryInDb);
        return null;
    }

}
