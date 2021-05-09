package com.javalessons.homeworkpoker;

import java.util.HashMap;

public class Deck {

    private final String[] faceStr = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final String[] suitStr = {"C", "S", "D", "H"};

    private final Card.Face[] faces = Card.Face.values();
    private final Card.Suit[] suits = Card.Suit.values();

    HashMap<String, Card> deckMap = new HashMap<>();

    public Deck() {
        for (int i = 0; i < faceStr.length; i++) {
            for (int j = 0; j < suitStr.length; j++){
                deckMap.put(faceStr[i]+suitStr[j], new Card(faces[i], suits[j]));
            }
        }
    }
}
