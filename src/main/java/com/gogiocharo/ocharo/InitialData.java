package com.gogiocharo.ocharo;

import com.gogiocharo.ocharo.model.Account;
import com.gogiocharo.ocharo.model.Card;
import com.gogiocharo.ocharo.service.AccountService;
import com.gogiocharo.ocharo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class InitialData {
    @Autowired
   AccountService accountService;
    @Autowired
    CardService cardService;
    @EventListener
    public void onApplicationEvent(ApplicationReadyEvent event) {
        Account account = new Account();
        account.setId(1L);
        account.setIban("iban1");
        account.setBicSwift("bicswift1");
        account.setClientId("12345");
        Account accountSaved = accountService.save(account);

        Card card = new Card();
        card.setId(1L);
        card.setAlias("gee");
        card.setCardType("virtual");
        card.setAccountId(accountSaved);
        cardService.save(card);

        Card card2 = new Card();
        card2.setId(2L);
        card2.setAlias("ocharo");
        card2.setCardType("virtual");
        card2.setAccountId(accountSaved);
        cardService.save(card2);


        account = new Account();
        account.setId(2L);
        account.setIban("iban2");
        account.setBicSwift("bicswift2");
        account.setClientId("123456");
        accountSaved = accountService.save(account);

        card = new Card();
        card.setId(3L);
        card.setAlias("gogi");
        card.setCardType("physical");
        card.setAccountId(accountSaved);
        cardService.save(card);

        card2 = new Card();
        card2.setId(4L);
        card2.setAlias("gogiocharo");
        card2.setCardType("physical");
        card2.setAccountId(accountSaved);
        cardService.save(card2);
    }

}
