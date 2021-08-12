package com.gogiocharo.ocharo.service;

import com.gogiocharo.ocharo.dto.AccountDtoUpdate;
import com.gogiocharo.ocharo.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account save(Account account);
    Account findById(Long accountId);
    Account update(AccountDtoUpdate account);
    void delete(Long accountId);
}
