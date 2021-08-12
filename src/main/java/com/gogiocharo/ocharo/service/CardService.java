package com.gogiocharo.ocharo.service;

import com.gogiocharo.ocharo.dto.CardDtoUpdate;
import com.gogiocharo.ocharo.model.Card;

import java.util.List;

public interface CardService {
    List<Card> findAll();
    Card save(Card card);
    Card update(CardDtoUpdate card);
    void delete(Long cardId);
    Card findById(Long id);
}
