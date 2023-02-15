package pl.dawidkaszuba.budgetservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "INCOMES")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime creationTime;
    private LocalDateTime lastEditTime;
    @ManyToOne
    @JsonIgnore
    private BudgetUser budgetUser;
    @ManyToOne
    private Category category;
    private double value;
}