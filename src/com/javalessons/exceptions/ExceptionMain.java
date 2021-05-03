package com.javalessons.exceptions;

import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter values ");
        int numerator = scanner.nextInt();
        int denominator = scanner.nextInt();
        System.out.println(divide(numerator,denominator));
    }

    private static int divide (int numerator, int denominator) {
        return  numerator / denominator;
    }
}
