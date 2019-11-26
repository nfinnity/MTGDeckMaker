package com.cabralduo.mtgdeckmaker.entity;

import lombok.Data;

import java.util.List;

@Data
public class Deck {

    private List<Card> cards;

    private int limit;

    private boolean hasSideDeck;

}
