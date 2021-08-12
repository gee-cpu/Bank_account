package com.gogiocharo.ocharo.controller;

import com.gogiocharo.ocharo.dto.AccountDtoUpdate;
import com.gogiocharo.ocharo.model.Account;
import com.gogiocharo.ocharo.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAccounts() {
        return accountService.findAll();
    }

    @GetMapping("/id")
    public Account getAccount(@PathVariable("id") Long id) {
        return accountService.findById(id);
    }

    @PostMapping
    public Account addAccount(@RequestBody Account account) {
        return accountService.save(account);
    }

    @PutMapping
    public Account addAccount(@RequestBody AccountDtoUpdate account) {
        return accountService.update(account);
    }

    @DeleteMapping("/id")
    public void deleteAccount(@PathVariable("id") Long id) {
        accountService.delete(id);
    }
}


