package com.javalessons.filesandstreams;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FormatterTest {

    public static void main(String[] args) throws FileNotFoundException {


        Formatter formatter = new Formatter("BankAccounts.txt");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter ClientId, Name, SecondName, Balance");
        int i = 0;
        while (i < 3) {
            try {
                formatter.format("%d, %s %s, %f\n", scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextFloat());
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect format, try again");
                scanner.nextLine();
            }
        }
        formatter.close();
    }
}
