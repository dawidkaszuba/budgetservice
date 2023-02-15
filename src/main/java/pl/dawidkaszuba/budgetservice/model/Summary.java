package pl.dawidkaszuba.budgetservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Summary {
    private double monthlyBalance;
    private double annualBalance;
    private double monthlyExpenses;
    private double monthlyIncomes;
}
