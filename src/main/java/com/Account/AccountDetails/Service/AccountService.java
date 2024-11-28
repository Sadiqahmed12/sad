package com.Account.AccountDetails.Service;

import com.Account.AccountDetails.Entity.AccountHolder;
import com.Account.AccountDetails.Repository.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    private static AccountRepo accountRepo;
    public static AccountHolder createAccount(AccountHolder accountholder) {
        AccountHolder accc = accountRepo.save(accountholder);
        return accc;

    }

    public Optional<AccountHolder> getAccountById(Long id) {
         return accountRepo.findById(id);




    }
}
