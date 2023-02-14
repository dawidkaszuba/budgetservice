package pl.dawidkaszuba.budgetservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/hello")
    public String hello(Principal principal) {
        return "<h1>Hello</h1><h2>"+principal.getName()+"</h2>";
    }
}
