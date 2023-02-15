package pl.dawidkaszuba.budgetservice.service;

import pl.dawidkaszuba.budgetservice.model.Summary;

public interface HomeService {
    Summary getSummary(String userName);
}
