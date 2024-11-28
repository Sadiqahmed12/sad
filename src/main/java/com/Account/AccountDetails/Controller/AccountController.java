package com.Account.AccountDetails.Controller;

import com.Account.AccountDetails.Entity.AccountHolder;
import com.Account.AccountDetails.Service.AccountService;
//import com.Account.AccountDetails.ServiceImpl.AccountServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/account")
public class AccountController {
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    private AccountService accountService;

    @PostMapping("/create")
    public ResponseEntity<AccountHolder> createAccount(
            @RequestBody AccountHolder accountholder
    ) {
        AccountHolder acc = AccountService.createAccount(accountholder);
        return ResponseEntity.ok(acc);


    }

    @GetMapping("/get/{id}")
    public ResponseEntity<AccountHolder> getAccount(@PathVariable Long id,
    @RequestBody AccountHolder accountHolder) {

        AccountHolder accountholder  = accountService.getAccountById(id);

    }
}












