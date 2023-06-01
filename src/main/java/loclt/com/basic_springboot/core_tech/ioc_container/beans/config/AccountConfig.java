package loclt.com.basic_springboot.core_tech.ioc_container.beans.config;

import loclt.com.basic_springboot.core_tech.ioc_container.beans.repo.AccountRepository;
import loclt.com.basic_springboot.core_tech.ioc_container.beans.services.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountConfig {

    @Bean
    public AccountService accountService() {
        return new AccountService(accountRepository());
    }

    @Bean
    public AccountRepository accountRepository() {
        return new AccountRepository();
    }
}
