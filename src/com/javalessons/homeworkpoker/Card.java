package com.javalessons.homeworkpoker;

import java.util.Arrays;
import java.util.List;

final class Card implements Comparable<Card> {


    public enum Face {

        TWO("2", 1), THREE("3", 2), FOUR("4", 3), FIVE("5", 4), SIX("6", 5),
        SEVEN("7", 6), EIGHT("8", 7), NINE("9", 8), TEN("10", 9),
        JACK("Jack", 10), QUEEN("Queen", 11), KING("King", 12), ACE("Ace", 13);

        String abbr;
        int rank;

        Face(String abbr, int rank) {
            this.abbr = abbr;
            this.rank = rank;
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

    public int getRank(){
        return face.rank;
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
