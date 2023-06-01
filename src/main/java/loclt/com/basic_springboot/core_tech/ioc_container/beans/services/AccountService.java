package loclt.com.basic_springboot.core_tech.ioc_container.beans.services;

import loclt.com.basic_springboot.core_tech.ioc_container.beans.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Simple Java class that we'll use as a Spring bean
 * */

public class AccountService {

    @Autowired
    private AccountRepository accountRepository;
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    };

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
