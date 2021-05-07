package com.javalessons.collections.collectionsClass;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {

        ArrayList<Card> deckCards = new ArrayList<>();

        for (int i = 0; i < Card.Face.values().length; i++) {
            for (int j = 0; j < Card.Suit.values().length; j++) {

                deckCards.add(new Card(Card.suits[j], Card.faces[i]));
            }
        }
        System.out.println("Шафлим дечку");
        Collections.shuffle(deckCards);
        printDeck(deckCards);

        System.out.println("\n\nСортируем дечку");
        Collections.sort(deckCards, new deckComparator());
        printDeck(deckCards);
    }

    private static void printDeck(ArrayList<Card> deckCards) {
        for (int i = 0; i < deckCards.size(); i++) {
            System.out.printf("%-20s %s", deckCards.get(i), (i + 1) % 4 == 0 ? "\n" : " ");
        }
    }

    public static class deckComparator implements Comparator<Card> {

        @Override
        public int compare(Card card1, Card card2) {
            Card.Face[] arrFaces = Card.Face.values();
            List<Card.Face> faces = Arrays.asList(arrFaces);
            if(faces.indexOf(card1.getFace()) < faces.indexOf(card2.getFace())) {
                return -1;
            } else if(faces.indexOf(card1.getFace()) > faces.indexOf(card2.getFace())) {
                return 1;
            } else if (faces.indexOf(card1.getFace()) == faces.indexOf(card2.getFace())) {
                return card1.getSuit().compareTo(card2.getSuit());
            }
            return 0;
        }
    }

}
