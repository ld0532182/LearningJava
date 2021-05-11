package com.javalessons.homeworkpoker;

import java.util.Scanner;
import java.util.TreeSet;

public class PokerMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deck deck = new Deck();

        String[] formattedInput;
        formattedInput = getFormatString();
        Hand hand1 = new Hand(formattedInput, deck);
        System.out.println(hand1);

        /*
        formattedInput = getFormatString();
        Hand hand2 = new Hand(formattedInput, deck);
        TreeSet<Hand> hands= new TreeSet<Hand>();
        hands.add(hand1);
        hands.add(hand2);
*/


    }

    private static String[] getFormatString() {
        String input;
        String[] formattedInput;
        do {
            System.out.println("Enter five cards in the format: '1D 1D 1D 1D 1D'\n");
            input = scanner.nextLine();
            formattedInput = input.split(" ");
        } while (formattedInput.length != 5);
        return formattedInput;
    }

    private static void chooseWinner(TreeSet<Hand> hand) {

    }
}
