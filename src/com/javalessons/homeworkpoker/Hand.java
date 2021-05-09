package com.javalessons.homeworkpoker;

import java.util.Arrays;

final class Hand {


    Card[] handCards = new Card[5];

    public Hand(String[] cards, Deck deck) {

        for (int i = 0; i < 5; i++) {
            handCards[i] = deck.deckMap.remove(cards[i]);
        }
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handCards=" + Arrays.toString(handCards) +
                '}';
    }
}


