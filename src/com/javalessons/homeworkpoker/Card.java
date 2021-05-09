package com.javalessons.homeworkpoker;

import java.util.Arrays;
import java.util.List;

final class Card implements Comparable<Card> {


    public enum Face {

        TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"),
        SEVEN("7"), EIGHT("8"), NINE("9"), TEN("10"),
        JACK("Jack"), QUEEN("Queen"), KING("King"), ACE("Ace");

        String abbr;

        Face(String abbr) {
            this.abbr = abbr;
        }
    }

    public enum Suit {

        CLUBS("Clubs"), SPADES("Spades"), DIAMONDS("Diamonds"), HEARTS("Hearts");

        String abbr;

        Suit(String abbr) {
            this.abbr = abbr;
        }
    }

    private final Face face;
    private final Suit suit;

    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    public Face getFace() {
        return face;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Face = " + face.abbr + " Suit = " + suit.abbr;

    }

    @Override
    public int compareTo(Card that) {
        Face[] arrFaces = Face.values();
        List<Face> faces = Arrays.asList(arrFaces);
        if (faces.indexOf(this.face) < faces.indexOf(that.face)) {
            return -1;
        } else if (faces.indexOf(this.face) > faces.indexOf(that.face)) {
            return 1;
        } else if (faces.indexOf(this.face) == faces.indexOf(that.face)) {
            return this.suit.compareTo(that.suit);
        }
        return 0;
    }

}
