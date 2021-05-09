package com.javalessons.homeworkpoker;

import java.util.ArrayList;
import java.util.Collections;

final class Hand implements Comparable<Hand> {

    private enum Combinations {
        HIGH_CARD, ONE_PAIR, TWO_PAIR, THREE_OF_A_KIND, STRAIGHT,

        FLUSH, FULL_HOUSE, FOUR_OF_A_KIND, STRAIGHT_FLUSH, ROYAL_FLUSH
    }

    Card.Face[] arrFaces = Card.Face.values();

    private Combinations handCombination;

    ArrayList<Card> handCards = new ArrayList<Card>();

    public Hand(String[] cards, Deck deck) {
        for (int i = 0; i < 5; i++) {
            this.handCards.add(deck.deckMap.remove(cards[i]));
        }
        Collections.sort(handCards);
        defineHandCombination();
    }


    private void defineHandCombination() {
        Card card1 = this.handCards.get(0);
        Card card2 = this.handCards.get(1);
        Card card3 = this.handCards.get(2);
        Card card4 = this.handCards.get(3);
        Card card5 = this.handCards.get(4);
        if (card1.getFace() == Card.Face.TEN && card2.getFace() == Card.Face.JACK &&
                card3.getFace() == Card.Face.QUEEN && card4.getFace() == Card.Face.KING
                && card5.getFace() == Card.Face.ACE) {
            handCombination = Combinations.ROYAL_FLUSH;
        } else if (compareForStraightFlushFaces()) {
            handCombination = Combinations.STRAIGHT_FLUSH;
        }
    }

    public Combinations getHandCombination() {
        return handCombination;
    }

    @Override
    public String toString() {
        return "Hand{" +
                "handCards=" + handCards +
                '}';
    }

    @Override
    public int compareTo(Hand otherHand) {
        return 0;
    }

    private boolean compareForStraightFlushFaces() {
        if (!((handCards.get(0).getSuit() == handCards.get(1).getSuit()) &&
                (handCards.get(0).getSuit() == handCards.get(2).getSuit()) &&
                (handCards.get(0).getSuit() == handCards.get(3).getSuit()) &&
                (handCards.get(0).getSuit() == handCards.get(4).getSuit()))) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (arrFaces[i] == handCards.get(0).getFace()) {
                return false;
            }
        }
        if ((handCards.get(0).getFace() == Card.Face.FIVE) && (handCards.get(4).getFace() == Card.Face.NINE)) {
            return true;
        }
        return false;
    }

}


