package pl.dawidkaszuba.budgetservice.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "budgetservice")
@Getter
@Setter
@ToString
public class BudgetServiceConfig {
    private String message;
    private String buildVersion;
}
