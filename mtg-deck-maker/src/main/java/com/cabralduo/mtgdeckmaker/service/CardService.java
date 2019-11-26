package com.cabralduo.mtgdeckmaker.service;

import com.cabralduo.mtgdeckmaker.entity.Card;
import com.cabralduo.mtgdeckmaker.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getCardByName(String name) {

        Optional<List<Card>> cardOpt = cardRepository.findAllByNameContaining(name);

        if(cardOpt.isPresent()) {
            return cardOpt.get();
        }

        return null;
    }

    public Card getCardById(String id) {
        Optional<Card> cardOpt = cardRepository.findById(id);

        if(cardOpt.isPresent()) {
            return cardOpt.get();
        }

        return null;
    }
}
