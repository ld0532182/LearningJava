package com.javalessons.homeworkpoker;

import java.util.Scanner;

public class PokerMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Deck deck = new Deck();

        String[] formattedInput;
        formattedInput = getFormatString();
        Hand hand1 = new Hand(formattedInput, deck);
        System.out.println(hand1);

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
}
