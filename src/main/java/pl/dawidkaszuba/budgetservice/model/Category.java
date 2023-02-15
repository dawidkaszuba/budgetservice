package pl.dawidkaszuba.budgetservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private CategoryType categoryType;
    @ManyToOne
    private BudgetUser budgetUser;
}
