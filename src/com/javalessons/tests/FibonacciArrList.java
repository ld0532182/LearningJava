package com.javalessons.tests;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciArrList {
    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(0);
        integers.add(1);
        integers.add(1);
        System.out.print("Enter a value ");
        int PreMaxFibValue = scanner.nextInt();
        int currentFibValue = 0;
        System.out.printf("%d %d %d", integers.get(0), integers.get(1), integers.get(2));
        while (PreMaxFibValue > currentFibValue) {
            currentFibValue = integers.get(integers.size() - 1) + integers.get(integers.size() - 2);
            integers.add(currentFibValue);
            System.out.print(" "+currentFibValue);
        }
        System.out.println("\nWe have " + (integers.size()) + " number of Fibonacci");
    }
}
