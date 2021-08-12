package com.gogiocharo.ocharo.controller;

import com.gogiocharo.ocharo.dto.CardDtoUpdate;
import com.gogiocharo.ocharo.model.Card;
import com.gogiocharo.ocharo.service.CardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards")
public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<Card> getCards() {
        return cardService.findAll();
    }

    @GetMapping("/id")
    public Card getCard(@PathVariable("id") Long id) {
        return cardService.findById(id);
    }

    @PostMapping
    public Card addCard(@RequestBody Card card) {
        return cardService.save(card);
    }

    @PutMapping
    public Card addCard(@RequestBody CardDtoUpdate card) {
        return cardService.update(card);
    }

    @DeleteMapping("/id")
    public void deleteCard(@PathVariable("id") Long id) {
        cardService.delete(id);
    }

}
