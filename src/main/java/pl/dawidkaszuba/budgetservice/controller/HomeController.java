package pl.dawidkaszuba.budgetservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dawidkaszuba.budgetservice.model.BudgetUser;
import pl.dawidkaszuba.budgetservice.model.Summary;
import pl.dawidkaszuba.budgetservice.service.BudgetUserService;
import pl.dawidkaszuba.budgetservice.service.HomeService;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final HomeService homeService;
    private final BudgetUserService budgetUserService;

    public HomeController(HomeService homeService, BudgetUserService budgetUserService) {
        this.homeService = homeService;
        this.budgetUserService = budgetUserService;
    }

    @GetMapping("/summary")
    public Summary getSummary(Principal principal) {
        BudgetUser user = budgetUserService.getOrCreateBudgetUserByUserName(principal.getName());
        return homeService.getSummary(user.getUserName());
    }
}
