package com.gogiocharo.ocharo.service;

import com.gogiocharo.ocharo.dto.AccountDtoUpdate;
import com.gogiocharo.ocharo.model.Account;
import com.gogiocharo.ocharo.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{


    private final AccountRepository accountRepository;
    public AccountServiceImpl(AccountRepository accountRepository){this.accountRepository=accountRepository;}


    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account findById(Long accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    @Override
    public Account update(AccountDtoUpdate account) {
     Account accountUpdate=accountRepository.getOne( account.getAccountId());
     if (accountUpdate!=null){
         accountUpdate.setBicSwift(account.getBicSwift());
         accountUpdate.setIban(account.getIban());
        return accountRepository.save(accountUpdate);
    }
     return null;
    }

    @Override
    public void delete(Long accountId) {
accountRepository.deleteById(accountId);
    }
}
