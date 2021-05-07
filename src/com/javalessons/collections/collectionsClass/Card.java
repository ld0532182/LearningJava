package com.javalessons.collections.collectionsClass;

import java.util.Arrays;
import java.util.List;

public class Card implements Comparable<Card> {


    public enum Face {Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

    public enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}

    public static Face[] faces = Face.values();
    public static Suit[] suits = Suit.values();

    private final Suit suit;

    private final Face face;

    public Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    public Suit getSuit() {
        return suit;
    }

    public Face getFace() {
        return face;
    }

    @Override
    public int compareTo(Card card) {
        Face[] arrFaces = Face.values();
        List<Face> faces = Arrays.asList(arrFaces);
        if(faces.indexOf(this.face) < faces.indexOf(card.face)) {
            return -1;
        } else if (faces.indexOf(this.face) > faces.indexOf(card.face)) {
            return 1;
        } else if (faces.indexOf(this.face) == faces.indexOf(card.face)) {
            return this.suit.compareTo(card.suit);
        }
        return 0;
    }

    @Override
    public String toString() {
        return face + " of " + suit;
    }
}
