package com.gogiocharo.ocharo.service;

import com.gogiocharo.ocharo.dto.CardDtoUpdate;
import com.gogiocharo.ocharo.model.Card;
import com.gogiocharo.ocharo.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    private final CardRepository cardRepository;
    public CardServiceImpl(CardRepository cardRepository){this.cardRepository=cardRepository;}


    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public Card update(CardDtoUpdate card) {
        Card cardUpdate=cardRepository.getOne(card.getCardId());
        if (cardUpdate!=null){
            cardUpdate.setAlias(card.getAlias());
            return cardRepository.save(cardUpdate);
        }
        return null;
    }

    @Override
    public void delete(Long cardId) {
cardRepository.deleteById(cardId);
    }

    @Override
    public Card findById(Long id) {
        return cardRepository.getById(id);
    }
}
